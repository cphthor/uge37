public class FormatZero {
  public static void main(String[] args) {

    double outVar = 123.11;
    String outString = "Kurt Verner";
    int outInteger = 7888666;

    /*
     * OPGAVE;
     * Producer flg output med printf og de tre variabler
       |123,1100|
       |   123,1100|
       |123,1|
       | 123,110|
       7888666
       7.888.666
       |     Kurt Verner|
       */
    //løsning
    System.out.printf("|%.4f|%n",outVar);
    System.out.printf("|%11.4f|%n",outVar);
    System.out.printf("|%4.1f|%n",outVar);
    System.out.printf("|%8.3f|%n",outVar);
    System.out.printf("%d%n",outInteger);
    System.out.printf("%,d%n",outInteger);
    System.out.printf("|%15s|%n",outString);
  }

}
