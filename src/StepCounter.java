import java.util.Scanner;
public class StepCounter {

    String Datum;
public StepCounter(String Date){
    this.Datum = Date;
}

    public static Scanner scanner = new Scanner(System.in);
    int step = 0;

    public void incrementSteps(){
    step++;
    }

    public void a() {
        String abc = new String("Am " + Datum + " bin ich " + step + " Schritte Gelaufen");
        System.out.println(abc.toString());
    }
}
