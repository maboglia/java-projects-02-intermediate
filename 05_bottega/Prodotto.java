package bottega;

public class Prodotto {
	private String nome;
	private double prezzo;
	
	public Prodotto(String n, double p) {
		nome = n;
		prezzo = p;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public void setPrezzo(double p) {
		prezzo = p;
	}
}
