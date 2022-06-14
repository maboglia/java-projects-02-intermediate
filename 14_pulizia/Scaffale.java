package pulizia;

public class Scaffale {
	private Detersivo[] detersivi;
	
	public Scaffale() {
		creaDetersivi();
	}
	
	private void creaDetersivi() {
		detersivi = new Detersivo[3];
		detersivi[0] = new Detersivo("Ava", 1);
		detersivi[1] = new Detersivo("Dash", 2);
		detersivi[2] = new Detersivo("Omo", 4);
	}
	
	public void elencoDetersivi() {
		for (int i = 0; i < detersivi.length; i++) {
			int pos = i + 1;
			Detersivo d = detersivi[i];
			System.out.println(pos + ") " + d.getNome() + " - " + d.getQuantita());
		}
	}
	
	public Detersivo daiDetersivo(int posizione) {
		int i = posizione - 1;
		Detersivo d = detersivi[i];
		return d;
	}
	
}
