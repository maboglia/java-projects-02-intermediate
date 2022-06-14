package bms;

public class Persona {
	
	private double altezza;
	private double peso;
	private int anni;
	private String attivitaFisica;
	private char sesso;
	
	public Persona(double altezza, double peso, int anni, String attivitaFisica, char sesso) {
		
		this.altezza = altezza;
		this.peso = peso;
		this.anni = anni;
		this.attivitaFisica = attivitaFisica;
		this.sesso = sesso;
	}
	
	public double getAltezza() {
		return this.altezza;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public int getAnni(){
		return this.anni;
	}
	
	public String getAttivitaFisica() {
		return this.attivitaFisica;
	}
	
	public char getSesso() {
		return this.sesso;
	}

	public String stampaDettagli() {
		return "Altezza: " + this.getAltezza() + "|| peso: " + this.getPeso() + "|| anni: " + this.getAnni() +
				"|| attività fisica: " + this.getAttivitaFisica() + "|| sesso: " + this.getSesso();
	}	
}

