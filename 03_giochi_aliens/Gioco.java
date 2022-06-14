package aliens;

public class Gioco {
	private Giocatore gamer;
	private Alieno[] aliens;

	public Gioco(Giocatore gamer, Alieno[] aliens) {
		this.gamer = gamer;
		this.aliens = aliens;
	}

	public Giocatore getGamer() {
		return this.gamer;
	}

	public Alieno[] getAliens() {
		return this.aliens;
	}

	public int damage() {
		int totDamage = 0;
		for (Alieno alien : aliens) {
			totDamage += alien.getDamage();
		}
		gamer.setHealth(gamer.getHealth() - totDamage);
		return totDamage;
	}

	public boolean isAlive(Giocatore gamer) {
		boolean isAlive = false;
		if(gamer.getHealth() > 0) {
			return true;
		}
		return isAlive;
	}
}
