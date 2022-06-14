package pulizia;

public class Detersivo {
	private String nome;
	private double quantita;
	
	public Detersivo(String n, double q) {
		nome = n;
		quantita = q;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getQuantita() {
		return quantita;
	}
}
