package bottega;

import java.util.Scanner;

public class BottegaTest {

	public static void main(String[] args) {
		Bottega bottega = new Bottega("Drogheria", "Mario");
		bottega.setIndirizzo("Viale Trieste, 15");
		bottega.setTelefono("0425-12345");
		bottega.setSitoWeb("www.google.it");
		
		Scanner sc = new Scanner(System.in);
		boolean devoUscire = false;
		
		while(!devoUscire) {
			System.out.println("Inserisci un comando:");
			String c = sc.next();
			if (c.equals("q")) {
				devoUscire = true;
			} else if (c.equals("elenca")) {
				bottega.elencaProdotti();
			} else if (c.equals("bottega")) {
				System.out.println("Nome: " + bottega.getNome());
				System.out.println("Nome bottegaio:" + bottega.getNomeBottegaio());
				System.out.println("Indirizzo: " + bottega.getIndirizzo());
				System.out.println("Telefono: " + bottega.getTelefono());
				System.out.println("Sito web: " + bottega.getSitoWeb());
				System.out.println("Incasso: € " + bottega.getIncasso());
			} else if (c.equals("acquista")) {
				bottega.elencaProdotti();
				System.out.println("Inserisci il numero del prodotto:");
				int pos = sc.nextInt();
				Prodotto pr = bottega.vendiProdotto(pos);
				System.out.println("Hai acquistato " + pr.getNome() +
									" per € " + pr.getPrezzo());
			} else if (c.equals("aggiungi")) {
				System.out.println("Inserisci nome:");
				String n = sc.next();
				System.out.println("Inserisci prezzo:");
				double p = sc.nextDouble();
				Prodotto prodotto = new Prodotto(n, p);
				bottega.nuovoProdotto(prodotto);
			}
		}
		
		sc.close();
	}

}
