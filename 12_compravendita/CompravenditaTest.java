package compravendita;

import java.util.Scanner;

public class CompravenditaTest {

	public static void main(String[] args) {
		Venditore v = new Venditore("Mediaworld");
		Compratore c = new Compratore("Mario", 2000.0);
		Scanner sc = new Scanner(System.in);
		boolean devoUscire = false;
		
		while (devoUscire != true) { // ciclo che dura fino all'invio di q
			System.out.println("Inserisci un comando:");
			String cmd = sc.next(); // leggiamo la stringa passata dall'utente
			// interpreto i comandi
			if (cmd.equals("q")) {
				devoUscire = true;
			} else if (cmd.equals("e")) {
				// stampo la lista dei prodotti del venditore
				c.elencaProdotti(v);
			} else if (cmd.equals("v")) {
				// stampo le informazioni sul venditore
				System.out.println("Venditore");
				System.out.println("Nome: " + v.getNome());
				System.out.println("Incasso: " + v.getIncasso());
			} else if (cmd.equals("c")) {
				// stampo le informazioni sul compratore
				System.out.println("Compratore");
				System.out.println("Nome: " + c.getNome());
				System.out.println("Soldi disponibili: " + c.getSoldi());
			} else if (cmd.equals("a")) {
				// procedura di acquisto
				c.elencaProdotti(v);
				System.out.println("Inserisci un numero da 1 a 3:");
				int pos = sc.nextInt();
				if (pos > 0 && pos <= 3) { // verifico se pos è da 1 a 3 compreso
					Prodotto p = c.compraProdotto(v, pos);
					System.out.println("Hai acquistato " + p.getNome() + 
							" per " + p.getPrezzo() + " euro");
				}
				
			}
		}
		sc.close(); // chiudo lo scanner
	}

}
