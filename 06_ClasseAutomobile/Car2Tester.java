package esempio;

public class Car2Tester {
	
	public static void percorri() {
		double kmPercorsi = 0;
		Car2 c = new Car2(22);
		c.addGas(15);
		do {
			try {
				c.drive(5);
				kmPercorsi = kmPercorsi + 5;
				System.out.println("Ho percorso " + kmPercorsi + " km");
				// sospente l'esecuzione per N millisecondi
				Thread.sleep(250); 
			} catch (Exception e) {
				System.out.println("Ho finito la benzina");
			}
		} while (c.getGas() > 0); // finchè ho benzina
		System.out.println("Km percorsi: " + kmPercorsi);
	}

	public static void main(String[] args) {
		Car2 ibiza = new Car2(20);
		ibiza.addGas(20);
		try {
			ibiza.drive(1000);
		} catch (Exception e) {
			System.out.println("Ho finito la benzina");
		}
		System.out.println(ibiza.getGas());
		
		percorri();
	}

}
