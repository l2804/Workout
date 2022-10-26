import java.util.Scanner;
public class Einlesen {

    public static Scanner sc = new Scanner(System.in);

    public static void a(){
        System.out.println("Bitte geben sie ihr Gewicht in Kilogramm an!\n");
        double gewicht = sc.nextDouble();
        System.out.println("Bitte geben sie jetzt ihre größe in Metern an!");
        double groesse = sc.nextDouble();

        Health.computeBMI(gewicht, groesse);
    }
}
