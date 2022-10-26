public class Health {

    static String BMI_Wert;
    static double BMI;

    public static void computeBMI(double mass, double height){
        double a = height * height;
        BMI = mass / a;

        if(BMI < 18.5){
            BMI_Wert = "Untergewichtig";
        }

        else if(BMI > 18.5 && BMI < 25){
            BMI_Wert = "Normalgewichtig";
        }

        else if(BMI > 25 && BMI < 30){
            BMI_Wert = "Übergewichtig";
        }

        else if(BMI > 30){
            BMI_Wert = "Fettleibig";
        }
    }

    public static void returnBMI(){
        System.out.println("Mit einem BMI von " + BMI + " sind Sie " + BMI_Wert + ".");
    }
}
