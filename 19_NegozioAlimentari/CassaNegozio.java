import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Aggiungi qui una descrizione della classe CassaNegozio
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class CassaNegozio implements Cassa
{

    private Map prodotti = new HashMap();

    private List fattura = new LinkedList();

    private double totaleLordo;

    private String codicePromozione;
    private int scontoPromozione;

    public void aggiungiProdotto(String codice, String desc, double prezzo){
        Prodotto p = new Prodotto(codice,desc,prezzo);
        prodotti.put(codice, p);
    }

    public void promozione(String codice, int sconto){
        codicePromozione = codice;
        scontoPromozione = sconto;
    }

    @Override
    public void leggi(String codice, int pezzi) throws ProdottoInesistente {
        Prodotto p = (Prodotto) prodotti.get(codice);

        if(p == null)
            throw new ProdottoInesistente();

        double prezzo = pezzi * p.ottieniPrezzo();

        if(inPromozione(p))
            prezzo *= (100 - scontoPromozione)/100.0;

        fattura.add(new Articolo(p, pezzi, prezzo));

        totaleLordo += prezzo;


    }

    private boolean inPromozione(Prodotto p) {
        return p.ottieniCodice().equals(codicePromozione);
    }

    @Override
    public void stampa() {

        Collections.sort(fattura);

        for(Iterator i=fattura.iterator(); i.hasNext();){
            Articolo articolo = (Articolo) i.next();

            System.out.print("Cod." +articolo.ottieniCodice() + " - ");
            System.out.print("\t");
            System.out.print(articolo.ottieniDescrizione() + " \tn.pezzi ");
            System.out.print("\t");
            System.out.print(articolo.ottieniPezzi() + " \tprezzo ");
            System.out.print("\t");
            System.out.println(articolo.ottieniPrezzo());
        }
    }

    @Override
    public void chiude() {
        fattura = new LinkedList();
        totaleLordo = 0;
    }

    @Override
    public double totale() {
        return totaleLordo;
    }

    @Override
    public double netto() {
        return totaleLordo / (1 + IVA);
    }

    @Override
    public double tasse() {
        return totaleLordo / (1 + IVA) * IVA;
    }

}
