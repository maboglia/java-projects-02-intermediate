package printers;

/**
 * Created by mauro on 08/01/16.
 */
public class Printer {

    private boolean isOn;
    private String modelNumber;
    private int sheet;

    public Printer(){}

    public Printer(boolean isOn, String modelNumber){
        this.isOn = isOn;
        this.modelNumber = modelNumber;
        this.sheet=10;
    }

    public void print(String s){
        if (isOn)
            System.out.println(s);
        else
            System.out.println("You must power on printer " + modelNumber);
    }

    public void print(int copies){
            String s = "Printer " + isOn + " model " + modelNumber;
/*
        switch(copies){

            case 0:
                break;

            case 1:
                if (isOn)
                    System.out.println(s);
            break;

            case 2:
                if (isOn){
                    System.out.println(s);
                    System.out.println(s);
                }
            break;

            default:
                System.out.println("numero copie non supportato");
                break;


        }

*/
        String status = "";

        if (isOn)
            status = " is On!";
        else
            status = " is Off!";

        if (isOn){
                for (int i = 0; i < copies; i++ ){
                    if(sheet <= 0) {
                        System.out.println("la carta è terminata");
                        System.out.println("la ricarico ");
                        sheet+=10;
                    }
                    System.out.println(s + " " + i);
                    sheet--;
               }
        }

        else
            System.out.println("Printer " + status);
    }


    public void printColors(){

        String[] colors = new String[] {"red", "green", "blue","black"};

        for (String colore : colors){

            if("red".equals(colore))
                System.out.println(colore);


            if(colore.equals("black"))
                System.out.println(colore);


        }

    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }



}
