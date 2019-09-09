import java.util.Scanner;
import java.util.Random;
class AsciiArtRandomLanguage {
  static final int MYRANGE=127;

  public static void main(String[] args) {

    int userDiagRetVal = doDiag();
    int userBasedRandom = doRand(userDiagRetVal);
    char myC = (char)userBasedRandom;
    String mySC = Character.toString(myC); 
    doArt(mySC);
    /*
     * FORMÅL: 
     * At formatere output og være kreativ II
     * (det bliver nemmere når vi får lov til at lave betingelsessætninger)
     *
     * OPGAVEN: Tegn en pyramidefigur vha et tilfældigt tegn indenfor
     * et bestemt sprogområde der vælges af brugeren.
     * Lav tre metoder med flg signaturer:
     *
     * Hjælp til løsning: brug javas random-generator, udtænk og/eller google
     * hvordan man får et heltal i et bestemt interval. Sørg derefter at gemme
     * tallet som en char og ikke en int (hint:typecast).
     * Lav metoder med flg signaturer:
     *
     * public static int doRand(int userInput)
     * public static int doDiag()
     * public static void doArt(String mySC) 
     *
     
     
      		      #      	
      		     ###    
      		    ##### 
      		   #######
      	          #########
      	         ############
      
     */

    // løsning
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
