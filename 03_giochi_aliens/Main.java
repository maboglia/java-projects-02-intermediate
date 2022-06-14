package aliens;

public class Main {
	public static void main(String[] args) {
		
		//Creazione giocatore
		Giocatore g1 = new Giocatore("Phil", 30);
		Giocatore g2 = new Giocatore("Tiri", 30);
		
		//Creazione gruppo alieni
		Alieno a1 = new Alieno("Marziano", 15);
		Alieno a2 = new Alieno("Venusiano", 8);
		Alieno a3 = new Alieno("Plutoniano", 3);
		Alieno a4 = new Alieno("Luniano", 5);
		
		//Creazione gioco
		Gioco game1 = new Gioco(g1, new Alieno[] {a1,a2,a3,a4});
		
		//Creazione gioco2, con creazione sul momento del gruppo alieni. 
		Gioco game2 = new Gioco(g2, new Alieno[] {new Alieno("Plum", 25), new Alieno("Skip", 2)});
		
		System.out.println("Totale danno: " + game1.damage());
		System.out.println("Vivo: " + game1.isAlive(g1));
	
		
		System.out.println("Totale danno: " + game2.damage());
		System.out.println("Vivo: " + game2.isAlive(g2));
	}
}
