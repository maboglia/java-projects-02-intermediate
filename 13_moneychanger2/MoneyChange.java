package moneychanger2;

public abstract class MoneyChange {
	
	public static Money[] change(int value){
		/*int[] ripetitions = new int[money.length]; //array che contiene la quantità di banconote da utilizzare
		
		for (int i = 0; i < money.length; i++) {
			int rep = value / money[i]; 
			
			if (rep > 0) {
				value -= money[i] * rep;
				ripetitions[i] = rep;
			}
		}
		return ripetitions;*/
		return money;
	}
}
