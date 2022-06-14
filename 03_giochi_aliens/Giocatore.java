package aliens;

public class Giocatore {
	private String name;
	private int health;

	public Giocatore(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
