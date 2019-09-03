import java.util.Scanner;
public class Test {
  public static void main(String[] args){
    //Brug scanner klasse
    //1. lav en instans
    Scanner myScan = new Scanner(System.in);
    //2. Få et input fra brugeren
    //2.1 Brug system-klassen til dialogen
    System.out.println("Indtast din alder: ");
    int age = myScan.nextInt();
    System.out.println("Indtast dit fulde navn");
    myScan.nextLine();
    String kundeNavn = myScan.nextLine();
    System.out.println("Indtast din vægt i kg:");
    double kiloVægt = myScan.nextDouble();
    System.out.println("Indtast din højde i centimeter:");
    int meterHoejde = myScan.nextInt();

    // TODO: gem vægt og højde i samme heltal
    // heightWeight = xy ;
    // height = x;
    // weight = y;
    //
    // exempel:
    // 175065,5
    // height = 175;
    // weight = 65,5;
    //
    int height;
    double weight;
    int tmpHeight = meterHoejde * 1000;
    double tmpWeight = kiloVægt * 10;




    System.out.println("");

  }
}
