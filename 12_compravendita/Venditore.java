package compravendita;

public class Venditore {
	private Prodotto[] prodotti;
	private String nome;
	private double incasso;

	public Venditore(String n) {
		nome = n;
		incasso = 0;
		prodotti = new Prodotto[3];
		// AGGIUNGIAMO I PRODOTTI
		creaProdotti();
	}

	private void creaProdotti() {
		prodotti[0] = new Prodotto("Samsung", 599.99);
		prodotti[1] = new Prodotto("HTC", 450.00);
		prodotti[2] = new Prodotto("Apple", 699.00);
	}

	public String getNome() {
		return nome;
	}

	public double getIncasso() {
		return incasso;
	}

	public void elencoProdotti() {
		for (int i = 0; i < prodotti.length; i++) {
			Prodotto p = prodotti[i];
			int pos = i + 1;
			// 1) Grana Padano - 10.50 €
			System.out.println(pos + ") " + p.getNome() + " - " + p.getPrezzo()
					+ " €");
		}
	}

	public Prodotto vendiProdotto(int posizione) {
		int i = posizione - 1; // posizione va da 1 a 3. mi riporto all'indice
								// giusto
		Prodotto p = prodotti[i]; // prendo il prodotto
		incasso = incasso + p.getPrezzo(); // aumento incasso
		return p; // restituisco il prodotto
	}
}
