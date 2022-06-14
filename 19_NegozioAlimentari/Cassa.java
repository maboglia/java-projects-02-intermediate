
/**
 * Aggiungi qui una descrizione della classe Cassa
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public interface Cassa
{

    //non devo usare modificatori di accesso, perché
    // automaticamente public, static, final
    double IVA = 0.22;

    //anche i metodi sono implicitamente public e abstract
    void leggi(String codice, int pezzi) throws ProdottoInesistente;
    void stampa();
    void chiude();
    double totale();
    double netto();
    double tasse();


}
