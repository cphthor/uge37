class AsciiArtPyraTwo {
  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output 
     *
     * 1)Tegn flg figur ved hjælp af #, |, mellemrum og printf
     * hint: brug to variabler og to tilhørende formatspecifiers
                      #          |
                     ###         |
                    #####        |
                   #######       |
                  #########      |
                 ###########     |
     
                 */

    // løsning
    String myC = "#";
    String myN = "|";
    System.out.printf("%11s%11s%n",myC,myN);
    myC = "###";
    myN = "|";
    System.out.printf("%12s%10s%n",myC,myN);
    myC = "#####";
    myN = "|";
    System.out.printf("%13s%9s%n",myC,myN);
    myC = "#######";
    myN = "|";
    System.out.printf("%14s%8s%n",myC,myN);
    myC = "#########";
    myN = "|";
    System.out.printf("%15s%7s%n",myC,myN);
    myC = "###########";
    myN = "|";
    System.out.printf("%16s%6s%n",myC,myN);
  }
}
