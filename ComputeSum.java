import java.util.Scanner;

public class ComputeSum {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * At få kendskab til scanner-klassen, at bygge metoder og returnere
     * værdier
     *
     * Opgave 
     * 1) Lad brugeren indtaste et hel-tal mellem 100 og 999.
     * Lav en metode som returnerer tværsummen (som er summen af de enkelte tal i
     * tallet)
     * exempel:
     * mitTal = 345
     * (hvor tværsummen så er 3 + 4 + 5, altså 11)
     *
     * Programmet skal udskrive flg:
     * Tværsummen er: 11
     *
     * Prøv at kalde programmet én gang til med den første tværsum.
     * Programmet skal nu udskrive flg:
     * Tværsummen er: 2
     *
     * 1) Lad brugeren indtaste et hel-tal mellem 1000 og 9999.
     * exempel:
     * number = 2345
     * Tværsummen er: 14
     *
     *
     */
    // TODO: udregning tværsummen af tallet alene vha division,addition og modulo
    
    //Løsning

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast et hel tal mellem 100 og 999: ");
    int number = myScan.nextInt();
    int sum = doMath(number);
    System.out.println("Tværsummen er: " + sum);
    sum = doMath(sum);
    System.out.println("Tværsummen er: " + sum);

  }
  public static int doMath(int number){
    int hundreder = number / 100;
    int rest = number % 100;
    int tiere = rest / 10;
    rest = tiere % 100;
    int sum = hundreder + tiere + rest;
    return sum;
  }
}
