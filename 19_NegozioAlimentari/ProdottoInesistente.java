
/**
 * Aggiungi qui una descrizione della classe ProdottoInesistente
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class ProdottoInesistente extends Exception
{
    public ProdottoInesistente(){
        super("Prodotto non registrato");
    }
}
