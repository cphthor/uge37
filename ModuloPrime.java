class ModuloPrime {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Få erfaring med modulo-operatoren
     * og oplev at skulle klare sig med få værktøjer
     * (da vi endnu ikke har loops and logic)
     *
     * OPGAVE:
     * Et primtal er et positivt heltal større end 1, 
     * der ikke er deleligt med andre hele positive tal end 1 
     * og tallet selv,
     *
     * 1) 
     * Løs den i første omgang med statisk input og uden metode
     * Brug modulo-operatoren, variablen startTal og System.out.println 
     * til at lave en primtalstest med et heltal mellem 2 og 20
     *
     * F.eks for tallet 5 skal programmet vise: 

     Hvis mere end to af nedenstående udsagn er sande så er 5 ikke et primtal
     0==0
     1==0
     2==0
     1==0
     0==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0
     5==0

     * 2) Løs den nu med Scanner-input så input bliver dynamisk.
     * Lav en metode hvor selve testen og outputtet bliver udregnet og vist. 
     * Giv Scanner-input med som parameter til metoden.

*/

    int startTal = 5;
    System.out.println("Hvis mere end to af nedenstående udsagn er sande så er " + startTal + " ikke et primtal");

    //TODO: 
    //System.out.println(0==0);

    //Løsning 1)
    System.out.println(startTal%1+ "==0");
    System.out.println(startTal%2+ "==0");
    System.out.println(startTal%3+ "==0");
    System.out.println(startTal%4+ "==0");
    System.out.println(startTal%5+ "==0");
    System.out.println(startTal%6+ "==0");
    System.out.println(startTal%7+ "==0");
    System.out.println(startTal%8+ "==0");
    System.out.println(startTal%9+ "==0");
    System.out.println(startTal%10+ "==0");
    System.out.println(startTal%11+ "==0");
    System.out.println(startTal%12+ "==0");
    System.out.println(startTal%13+ "==0");
    System.out.println(startTal%14+ "==0");
    System.out.println(startTal%15+ "==0");
    System.out.println(startTal%16+ "==0");
    System.out.println(startTal%17+ "==0");
    System.out.println(startTal%18+ "==0");
    System.out.println(startTal%19+ "==0");
    System.out.println(startTal%20+ "==0");
    //Løsning 2)
    //
    /*
       import java.util.Scanner;
       class ModuloPrime {
       public static void main(String[] args) {
       int userInt;
       Scanner myScan = new Scanner(System.in);
       System.out.println("indtast et heltal mellem 1 og 20");
       userInt = myScan.nextInt();
       testPrime(userInt);
       }
       public static void testPrime(int userInput) {
       System.out.println("Hvis mere end to af nedenstående udsagn er sande så er " + userInput + " ikke et primtal");
       System.out.println(userInput%1+ "==0");
       System.out.println(userInput%2+ "==0");
       System.out.println(userInput%3+ "==0");
       System.out.println(userInput%4+ "==0");
       System.out.println(userInput%5+ "==0");
       System.out.println(userInput%6+ "==0");
       System.out.println(userInput%7+ "==0");
       System.out.println(userInput%8+ "==0");
       System.out.println(userInput%9+ "==0");
       System.out.println(userInput%10+ "==0");
       System.out.println(userInput%11+ "==0");
       System.out.println(userInput%12+ "==0");
       System.out.println(userInput%13+ "==0");
       System.out.println(userInput%14+ "==0");
       System.out.println(userInput%15+ "==0");
       System.out.println(userInput%16+ "==0");
       System.out.println(userInput%17+ "==0");
       System.out.println(userInput%18+ "==0");
       System.out.println(userInput%19+ "==0");
       System.out.println(userInput%20+ "==0");
       }
     }
       */
  }
}
