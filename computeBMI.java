import java.util.Scanner;
public class ComputeBMI {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * Genopfrisk scanner og bmi fra sidste uge.
     *
     * OPGAVE: 
     * Lav et program der på seks linjer indlæser
     * højde og vægt fra en bruger og derpå printer
     * BMI vha println
     *
     */

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg (én decimal):");
    double kiloVægt = myScan.nextDouble();
    System.out.println("Indtast din højde meter (to decimaler):");
    double meterHoejde = myScan.nextDouble();
    System.out.println("Din BMI: " + (kiloVægt/(meterHoejde*meterHoejde)));
  }
}
