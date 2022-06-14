package bms;

public class Salute {

	public double mb(Persona persona) {
		
		double metabolismo = 0;
		
		if(persona.getSesso() == 'f') {
			metabolismo = 655 + (9.6 * persona.getPeso()) + (1.8 * persona.getAltezza()) + (4.7 * persona.getAnni());
		} else {	
			metabolismo = 655 + (13.8 * persona.getPeso()) + (1.8 * persona.getAltezza()) + (4.7 * persona.getAnni());
		}	
		
		switch(persona.getAttivitaFisica()) {
			case "sedentario":
				return metabolismo + (metabolismo * 0.2);
			case "moderatamente attivo":
				return metabolismo; //+ (metabolismo * 0.3) ;
			case "attivo":
				return metabolismo + (metabolismo * 0.4);
			default:
				return metabolismo + (metabolismo * 0.5);
		}  
	}
}
