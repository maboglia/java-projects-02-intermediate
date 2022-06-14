
public class Main {
	public static void main(String[] args) {
		
		int valuta = 1892;
			
		int[] result = MoneyChanger.changer(valuta);
			
		if(result[0] >= 1) {
			System.out.println("Da 500: " + result[0]);
		}
		
		if(result[1] >= 1) {
			System.out.println("Da 200: " + result[1]);
		}
			
		if(result[2] >= 1) {
			System.out.println("Da 100: " + result[2]);
		}
			
		if(result[3] >= 1) {
			System.out.println("Da 50: " + result[3]);
		}
			
		if(result[4] >= 1) {
			System.out.println("Da 20: " + result[4]);
		}
			
		if(result[5] >= 1) {
			System.out.println("Da 10: " + result[5]);
		}
			
		if(result[6] >= 1) {
			System.out.println("Da 5: " + result[6]);
		}
			
		if(result[7] >= 1) {
			System.out.println("Da 2: " + result[7]);
		}
			
		if(result[8] >= 1) {
			System.out.println("Da 1: " + result[8]);
		}
	}
}
