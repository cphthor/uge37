public class FormatZero {
  public static void main(String[] args) {

    double outVar = 123.11;
    String outString = "Kurt Verner";
    int outInteger = 7888666;

    /*
     * FORMÅL:
     * Øve komposition, Math og afrunding
     *
     * OPGAVE;
     * opgave 1)
     * Producer flg output med printf og de tre variabler
       |123,1100|
       |   123,1100|
       |123,1|
       | 123,110|
       7888666
       7.888.666
       |     Kurt Verner|
     * opgave 2)
     * kvadratroden af 675 er afrundet på 14 decimal 25.98076211353316
     * udregn og gem kvadratroden korrekt afrundet på 2. decimal kun ved
     * hjælp af Math og de almindelige regnefunktioner.
     * opgave 3)
     * Samme som i opg 2) men nu med 3 decimaler
     *
       */
    //løsning opg 1
    System.out.printf("|%.4f|%n",outVar);
    System.out.printf("|%11.4f|%n",outVar);
    System.out.printf("|%4.1f|%n",outVar);
    System.out.printf("|%8.3f|%n",outVar);
    System.out.printf("%d%n",outInteger);
    System.out.printf("%,d%n",outInteger);
    System.out.printf("|%15s|%n",outString);
    //løsning opg 2
    double mySqrt = Math.round((Math.sqrt(675)*100))/100.0;
    System.out.println(mySqrt);
    //løsning opg 3
    mySqrt = Math.round((Math.sqrt(675)*1000))/1000.0;
    System.out.println(mySqrt);
  }

}
