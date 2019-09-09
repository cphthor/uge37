class AsciiArtPyraTwo {
  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output 
     *
     * OPGAVE:
     * Tegn flg figur ved hjælp af #, |, mellemrum og printf
     * hint: brug to variabler og to tilhørende formatspecifiers
     
      |          #          |
      |         ###         |
      |        #####        |
      |       #######       |
      |      #########      |
      |     ###########     |
      */

    // løsning
    String myC = "#";
    String myN = "|";
    System.out.printf("%s%11s%11s%n",myN,myC,myN);
    myC = "###";
    System.out.printf("%s%12s%10s%n",myN,myC,myN);
    myC = "#####";
    System.out.printf("%s%13s%9s%n",myN,myC,myN);
    myC = "#######";
    System.out.printf("%s%14s%8s%n",myN,myC,myN);
    myC = "#########";
    System.out.printf("%s%15s%7s%n",myN,myC,myN);
    myC = "###########";
    System.out.printf("%s%16s%6s%n",myN,myC,myN);
  }
}
