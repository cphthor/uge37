import java.util.Scanner;
public class ComputeBMI {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * At få kendskab til scanner-klassen
     *
     * Opgave 
     * 1)
     *
     */

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg:");
    double kiloVægt = myScan.nextDouble();
    System.out.println("Indtast din højde i centimeter:");
    double meterHoejde = myScan.nextDouble();
    double bmi = kiloVægt/(meterHoejde*meterHoejde);
    System.out.println("Din BMI: " + bmi);

  }
}
