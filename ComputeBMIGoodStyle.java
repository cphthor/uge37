import java.util.Scanner;
public class ComputeBMIGoodStyle {
  /*
   *
   */

  public static int doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg (med max én decimal):");
    double weightKg = myScan.nextDouble();
    System.out.println("Indtast din højde i meter(med max to):");
    double heightM = myScan.nextDouble();
    // now compute returnval
    int retVal = (int)(weightKg * 1000 * 10) + (int)(heightM*100);
    return retVal;

  }

  public static double doMath(int totalVal) {
    // vi modtager 755175
    double tmpH = (totalVal%1000)/100.0 ;
    double tmpW = totalVal/1000/10.0 ;
   System.out.println(tmpW); 
   System.out.println(tmpH); 
    double BMI = tmpW/(tmpH*tmpH);
    return BMI;
  }

  public static void doPrint(double BMI) {
    System.out.println("BMI: " + BMI);
  }

  public static void main(String[] args){
    int retVal = doDiag();
    double bmi = doMath(retVal);
    doPrint(bmi);
  }
}
