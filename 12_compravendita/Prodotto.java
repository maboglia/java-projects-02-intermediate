package compravendita;

public class Prodotto {
	private String nome;
	private double prezzo;
	
	public Prodotto (String n, double p) {
		nome = n;
		prezzo = p;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
}
