package esempio;

public class Car {
	private double gas;
	private double kml;
	
	public Car(double resa) {
		kml = resa;
		gas = 0;
	}
	
	public void drive (double km) {
		gas = gas - (km / kml);
	}
	
	public double getGas() {
		return gas;
	}
	
	public void addGas(double rifornimento) {
		gas = gas + rifornimento;
	}
}
