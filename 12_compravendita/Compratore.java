package compravendita;

public class Compratore {
	private String nome;
	private double soldi;
	
	public Compratore(String n, double s) {
		nome = n;
		soldi = s;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSoldi() {
		return soldi;
	}
	
	public void elencaProdotti(Venditore v) {
		v.elencoProdotti();
	}
	
	public Prodotto compraProdotto(Venditore v, int posizione) {
		// chiedo al venditore di vendermi il prodotto in posizione
		// lo ricevo come risultato dell'operazione
		Prodotto p = v.vendiProdotto(posizione);
		// qui diminuisco i soldi del prezzo del prodotto
		soldi = soldi - p.getPrezzo();
		return p;
	}
}
