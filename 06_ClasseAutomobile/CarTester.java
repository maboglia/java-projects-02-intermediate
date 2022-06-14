package esempio;

public class CarTester {

	public static void main(String[] args) {
		Car ibiza = new Car(20);
		ibiza.addGas(20);
		ibiza.drive(100);
		System.out.println(ibiza.getGas());
	}

}
