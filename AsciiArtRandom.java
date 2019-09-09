import java.util.Random;
class AsciiArtRandom {
  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output og være kreativ
     *
     * OPGAVEN: Tegn en pyramidefigur vha et tilfældigt tal mellem 33 og 125
     * (Opgaven byggere videre på sidste uges opgave om mystiske tal)
     *
     * Hjælp til løsning: brug javas random-generator, udtænk og/eller google
     * hvordan man får et heltal i et bestemt interval. Sørg derefter at gemme
     * tallet som en char og ikke en int (hint:typecast).
     * Lav en metode med flg signatur:
     * public static void doArt(String mySC) 
     * For at den virker skal din char laves til String. Det gør man på flg måde:
     * String mySC = Character.toString(myChar); 
     *
     * Herunder eksempler fra fire kørsler af programmet
     
          T
         TTT
        TTTTT
       TTTTTTT
      TTTTTTTTT
     TTTTTTTTTTT
          6
         666
        66666
       6666666
      666666666
     66666666666
          k
         kkk
        kkkkk
       kkkkkkk
      kkkkkkkkk
     kkkkkkkkkkk
          F
         FFF
        FFFFF
       FFFFFFF
      FFFFFFFFF
     FFFFFFFFFFF
     
      
     */

    // løsning
    Random myRand = new Random();
    int MAX = 125;
    int MIN = 33;
    
    int myInt = myRand.nextInt((MAX-MIN)+1)+MIN;
    char myC = (char)myInt;
    String mySC = Character.toString(myC); 
    doArt(mySC);
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
