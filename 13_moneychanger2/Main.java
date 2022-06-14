package moneychanger2;

public class Main {
	public static void main(String[] args) {
		int[] money = MoneyChange.money;
		
		int val = 1254890;
		
		System.out.println("Per cambiare " + val + "€ ti servono: ");
		
		int[] retArr = MoneyChange.change(val);		
		
		for (int i = 0; i < retArr.length; i++){
			String valueType = "";
			
	    	if (retArr[i] > 0){
	    		if(money[i] >= 5){
	    			if (retArr[i] > 1)
	    				valueType = " banconote";
	    			else
	    				valueType = " banconota";
	    		}
	    		else{
	    			if (retArr[i] > 1)
	    				valueType = " monete";
	    			else
	    				valueType = " moneta";
	    		}
		    	System.out.println(retArr[i] + valueType + " da " + money[i] + "�");
	    	}
	    	
	    }
	}
}
