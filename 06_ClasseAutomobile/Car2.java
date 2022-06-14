package esempio;

public class Car2 {
	private double gas;
	private double kml;
	
	public Car2(double resa) {
		kml = resa;
		gas = 0;
	}
	
	public void drive (double km) throws Exception {
		gas = gas - (km / kml);
		if (gas <= 0) {
			gas = 0;
			throw new Exception("Fine benzina");
		}
	}
	/* ALTERNATIVA CON CONTROLLO SOPRA L'OPERAZIONE
	public void drive (double km) throws Exception {
		if (gas - (km / kml) <= 0) {
			gas = 0;
			throw new Exception("Fine benzina");
		}
		gas = gas - (km / kml);
	}
	*/
	public double getGas() {
		return gas;
	}
	
	public void addGas(double rifornimento) {
		gas = gas + rifornimento;
	}
}
