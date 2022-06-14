import rubrica.Rubrica;

/**
 * Classe con un main di esempio.
 */
public class Principale {

    /**
     * Esempio di uso della classe Rubrica.
     * Può essere utilizzato come semplice "test"
     * 
     */
	public static void main(String[] args) {
		
		// Quando si crea un oggetto Rubrica si deve fornire un nome 
		Rubrica r = new Rubrica("prova");
		
		//...che è poi accessibile tramite il metodo getTitolo().
		String titoloRubrica = r.getTitolo();
		System.out.println("Creata rubrica con nome " + titoloRubrica);
		
		// L'inserimento di una nuova voce nella rubrica avviene 
		// tramite il metodo aggiungi() che riceve tre parametri
		// stringa: nome, cognome, e telefono.
		r.aggiungi("Giovanni","Bianchi","123 45 67");
		r.aggiungi("Mario","Rossi","321 98 76");
		r.aggiungi("Giuseppe","Verdi","456 789 123");
		
		// Per accedere al primo elemento della rubrica si 
		// utilizza il metodo primo()
		String primaVoce = r.primo();
		System.out.println("primo() --> " + primaVoce);
		
		// Per accedere ad un elemento qualsiasi nella rubrica 
		// si utilizza il metodo voce() che riceve come parametro 
		// il numero d'ordine della voce (a partire da 1, 
		// perciò primo() == voce(1));
		primaVoce = r.voce(1); 
		System.out.println("voce(1) --> " + primaVoce);
		System.out.println("voce(2) --> " + r.voce(2));
		System.out.println("voce(3) --> " + r.voce(3));
		
		// Il metodo elenco() restituisce una stringa con 
		// l'elenco delle voci della rubrica separate da ", "; 
		// l'elenco inizia con "(" e termina con ")".
		System.out.println("Elenco: " + r.elenco());
		
		// il metodo ricerca() restituisce la stringa 
		// corrispondente alla prima voce che contiene il 
		// parametro come nome, cognome oppure telefono
		System.out.println("Ricerca 'Verdi': " + r.ricerca("Verdi"));
	}
}
