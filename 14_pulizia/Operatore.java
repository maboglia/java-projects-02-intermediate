package pulizia;

public class Operatore {
	private String nome;
	
	public Operatore(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void elencaDetersivi(Scaffale s) {
		s.elencoDetersivi();
	}
	
	public Detersivo prendiDetersivo(Scaffale s, int posizione) {
		Detersivo d = s.daiDetersivo(posizione);
		return d;
	}
}
