import java.util.Scanner;
public class FormatZero {
  public static void main(String[] args) {

    Scanner myScan = new Scanner(System.in);
    double outVar = myScan.nextFloat();
    String outString = myScan.next();
    int outInteger = myScan.nextInt();
    /*
     * OPGAVE;
     * Producer flg output med printf
       |123,1100|
       |123,1100|
       |   123,1100|
       |123,1|
       | 123,110|
       KurtVerner
       7888666
       7.888.666
       KurtVerner
       |     KurtVerner|
       */
    //løsning
    System.out.printf("|%.4f|%n",outVar);
    System.out.printf("|%2.4f|%n",outVar);
    System.out.printf("|%11.4f|%n",outVar);
    System.out.printf("|%4.1f|%n",outVar);
    System.out.printf("|%8.3f|%n",outVar);
    System.out.printf("%d%n",outInteger);
    System.out.printf("%,d%n",outInteger);
    System.out.printf("%15s%n",outString);
    System.out.printf("|%15s|%n",outString);
  }

}
