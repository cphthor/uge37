class AsciiArtPyraOne {
  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output 
     *
     * OPGAVEN:
     * 1)Tegn flg figur ved hjælp af #, mellemrum og printf
     * hint: gem tegnet i en streng-variabel og brug formatspecifiers
     * til at lave passende mellemrum
     
     
      		      #      	
      		     ###    
      		    ##### 
      		   #######
      	          #########
      	         ############
      
     */

    // løsning
    String myC = "#";
    System.out.printf("%11s%n",myC);
    myC = "###";
    System.out.printf("%12s%n",myC);
    myC = "#####";
    System.out.printf("%13s%n",myC);
    myC = "#######";
    System.out.printf("%14s%n",myC);
    myC = "#########";
    System.out.printf("%15s%n",myC);
    myC = "###########";
    System.out.printf("%16s%n",myC);
  }
}
