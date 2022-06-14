package principale;

import printers.Printer;

/**
 * Created by mauro on 08/01/16.
 */
public class Principale {

    public static void main(String[] args) {

        Printer stampanteCasa = new Printer(false, "Samsung");

        stampanteCasa.turnOn();

        stampanteCasa.print("stampo una stringa");

        stampanteCasa.turnOff();
        stampanteCasa.print(20);

        stampanteCasa.turnOn();
        stampanteCasa.print(20);

        stampanteCasa.printColors();

    }



}
