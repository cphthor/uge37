import java.util.Scanner;
import java.util.Random;
class AsciiArtRandomLanguage {
  static final int MYRANGE=127;

  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output og være kreativ II
     * (det bliver nemmere når vi får lov til at lave betingelsessætninger)
     *
     * OPGAVEN: Tegn en pyramidefigur vha et tilfældigt tegn indenfor
     * et bestemt sprogområde der vælges af brugeren.
     * Lav tre metoder med flg signaturer:
     * public static int doRand(int userInput)
     * public static int doDiag()
     * public static void doArt(String mySC) 
     *
     * Nedenfor er doDiag() lavet så man ikke behøver at tænke over hvilke
     * tal der rammer indenfor hvilke sprog. Er man nysgerrig kan man kigge
     * på https://unicode-table.com/en/. Husk at unicode-værdien er angivet i
     * hexadecimaltal og skal derfor laves om til titals-systemet for at man 
     * rammer sprogområdet. 
     *
     *
          ·
         ···
        ·····
       ·······
      ·········
     ···········
     
          ك
         ككك
        ككككك
       ككككككك
      ككككككككك
     ككككككككككك
     

  public static int doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast 1536 (Arabisk), 880 (Græsk), 9472 (box) eller bare helt tilfældigt: ");
    int userInt = myScan.nextInt();
    return userInt;
  }
     */
    // løsning
    int userDiagRetVal = doDiag();
    int userBasedRandom = doRand(userDiagRetVal);
    char myC = (char)userBasedRandom;
    String mySC = Character.toString(myC); 
    doArt(mySC);
  }
  public static int doRand(int userInput) {
    Random myRand = new Random();
    int MAX = userInput + MYRANGE;
    int MIN = userInput;
    int myInt = myRand.nextInt((MAX-MIN)+1)+MIN;
    return myInt;
    }

  public static int doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast 1536 (Arabisk), 880 (Græsk), 9472 (box) eller bare helt tilfældigt: ");
    int userInt = myScan.nextInt();
    return userInt;
  }
  public static void doArt(String myC) {
    String myS = myC;
    System.out.printf("%11s%n",myS);
    myS = myS + myC + myC;
    System.out.printf("%12s%n",myS);
    myS = myS + myC + myC;
    System.out.printf("%13s%n",myS);
    myS = myS + myC + myC;
    System.out.printf("%14s%n",myS);
    myS = myS + myC + myC;
    System.out.printf("%15s%n",myS);
    myS = myS + myC + myC;
    System.out.printf("%16s%n",myS);
  }
}
