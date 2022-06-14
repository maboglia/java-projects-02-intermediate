package week3.calcoloPeso;

import java.util.Scanner;

/**
 * Created by mauro on 22/06/16.
 */
public class GetInput {

    private static Scanner lettore = new Scanner(System.in);


    public static int leggiIntero(String messaggio){

        System.out.println(messaggio);
        return lettore.nextInt();


    }

    public static double leggiDouble(String messaggio){

        System.out.println(messaggio);
        return lettore.nextDouble();


    }



}
