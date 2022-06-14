
public class MoneyChanger {
	
	public static int[] changer(int valuta) {
		
		int[] array = new int[9];
		
		int accCinquecento = 0;
		int accDuecento = 0;
		int accCento = 0;
		int accCinquanta = 0;
		int accVenti = 0;
		int accDieci = 0;
		int accCinque = 0;
		int accDue = 0;
		int accUno = 0;
		
		if(valuta >= 500) {
			while(valuta >= 500) {
				valuta -= 500;
				accCinquecento++;
			}
			array[0] = accCinquecento;
		}
		
		if(valuta >= 200) {
			while(valuta >= 200) {	
				valuta -= 200;
				accDuecento++;
			}
			array[1] = accDuecento;
		}
		
		if(valuta >= 100) {
			while(valuta >= 100) {
				valuta -= 100;
				accCento++;
			}
			array[2] = accCento;
		}
		
		if(valuta >= 50) {
			while(valuta >= 50) {
				valuta -= 50;
				accCinquanta++;
			}
			array[3] = accCinquanta;
		}
		
		if(valuta >= 20) {
			while(valuta >= 20) {
				valuta -= 20;
				accVenti++;
			}
			array[4] = accVenti;
		}
		
		if(valuta >= 10) {
			while(valuta >= 10) {
				valuta -= 10;
				accDieci++;
			}
			array[5] = accDieci;
		}
		
		if(valuta >= 5) {
			while(valuta >= 5) {
				valuta -= 5;
				accCinque++;
			}
			array[6] = accCinque;
		}
		
		if(valuta >= 2) {
			while(valuta >= 2) {
				valuta -= 2;
				accDue++;
			}
			array[7] = accDue;
		}
		
		if(valuta >= 1) {
			while(valuta >= 1) {
				valuta -= 1;
				accUno++;
			}
			array[8] = accUno;

		}
		
		return array;
	}
}
