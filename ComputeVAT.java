/*
 * FORMÅL:
 * At få kendskab til scanner-klassen, at bygge metoder og returnere
 * værdier
 *
 * Opgave 
 * 1) Lad brugeren indtaste en pris.
 * Definér en konstant som er momssatsen
 * Lav en metode som returnerer momsdelen af beløbet
 * exempel:
 * mitPris = 345,25
 *
 * Programmet skal udskrive flg:
 * Momsen udgør: 
 *
 *
 */
// TODO: udregning tværsummen af tallet alene vha division,addition og modulo

//Løsning

import java.util.Scanner;
public class ComputeVAT {
  final static int prctVAT = 25;

  public static void main(String[] args){

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast varens pris: ");
    double number = myScan.nextDouble();
    double moms = doVAT(number);
    System.out.printf("Momsen udgør: %.2f%n",moms);

  }
  public static double doVAT(double number){
    double VAT = number / 100 * prctVAT; 
    return VAT;
  }
}
