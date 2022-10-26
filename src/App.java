import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Einlesen einlesen = new Einlesen();
        Health health = new Health();

        einlesen.a();
        health.returnBMI();

        System.out.println("Welcher tag ist Heute?");

        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        StepCounter game = new StepCounter(test);

        Random rand = new Random(); //instance of random class
        int upperbound = 50000; //generate random values from 0-49000

        int a = rand.nextInt(upperbound);

        for(int b = a; b > 0; b--){
            game.incrementSteps();
        }
        game.a();
    }
}
