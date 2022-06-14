package bms;

public class Main {

	public static void main (String[] args) {
	
		Salute salute = new Salute(); 
		
		Persona p1 = new Persona(165, 60, 18, "sedentario", 'm');
		System.out.println(p1.stampaDettagli());
		System.out.println("MBR: " + salute.mb(p1) + "\n");
		
		Persona p2 = new Persona(156, 56, 22, "moderatamente attivo", 'f');
		System.out.println(p2.stampaDettagli());
		System.out.println("MBR: " + salute.mb(p2) + "\n");
		
		Persona p3 = new Persona(175, 60, 30, "attivo", 'm');
		System.out.println(p3.stampaDettagli());
		System.out.println("MBR: " + salute.mb(p3) + "\n");
		
		Persona p4 = new Persona(180, 80, 51, "moderatamente attivo", 'f');
		System.out.println(p4.stampaDettagli());
		System.out.println("MBR: " + salute.mb(p4) + "\n");
		
	}
}
