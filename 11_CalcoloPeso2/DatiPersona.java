package week3.calcoloPeso;


public class DatiPersona {

    private final static String MESSAGGIO_BASE = "Dati un peso di %1.1f kg e un'altezza di %1.2f mt \n";
    private final static String MESSAGGIO_ALTEZZA = "Inserire l'altezza in metri";
    private final static String MESSAGGIO_OUT1 = "L'indice di massa corporea IMC è %1.2f \n";
    private final static String MESSAGGIO_OUT2 = "Servono %d kilocalorie giornaliere";

    private double peso; //in kilogrammi
    private double altezza; //in metri

    public DatiPersona(double peso, double altezza) {
        this.peso = peso;
        this.altezza = altezza;
    }


    @Override
    public String toString() {

        StringBuffer risposta = new StringBuffer();
        risposta.append(String.format(MESSAGGIO_BASE, peso, altezza));
        risposta.append(String.format(MESSAGGIO_OUT1, indiceMC()));
        risposta.append(String.format(MESSAGGIO_OUT2, kcalDay()));

        return risposta.toString();
    }

    public int kcalDay() {
        double pesoLibbre = peso * UnitaMisura.LIBBRE_X_KG;
        double calorieLibbra = pesoLibbre * UnitaMisura.CALORIE_X_LIBBRA;

        return (int) calorieLibbra;

    }

    public double indiceMC() {
        return peso/(altezza * altezza);
    }



}
