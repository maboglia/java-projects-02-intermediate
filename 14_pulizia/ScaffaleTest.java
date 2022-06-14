package pulizia;

import java.util.Scanner;

public class ScaffaleTest {

	public static void main(String[] args) {
		Scaffale s = new Scaffale();
		Operatore o = new Operatore("Mario");
		Scanner sc = new Scanner(System.in);
		boolean devoUscire = false;
		
		while (!devoUscire) { // devoUscire == false
			System.out.println("Inserisci comando:");
			String cmd = sc.next();
			
			if (cmd.equals("q")) {
				devoUscire = true;
			} else if (cmd.equals("e")) {
				o.elencaDetersivi(s);
			} else if (cmd.equals("o")) {
				System.out.println("Nome operatore: " + o.getNome());
			} else if (cmd.equals("p")) {
				o.elencaDetersivi(s);
				System.out.println("Inserisci numero (1-3):");
				int pos = sc.nextInt();
				if (pos > 0 && pos <= 3) {
					Detersivo d = o.prendiDetersivo(s, pos);
					System.out.println("Hai preso " + d.getNome());
				}
			}
		}
		
		sc.close();
	}

}
