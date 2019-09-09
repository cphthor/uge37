public class OrderOfPrec
{
  public static void main(String[] args)
  {
    /*
     * OPGAVE: 
     *
     * 1) ret så flg. bliver korrekt (brug printf, parenteser, typecasting etc)
     * 0.3333333333333333 = 1/3; //kun vha println
     * 0.33333334 = 1/3; //kun vha println
     * 0.33 = 1/3; 
     * 144 = 12*2+2*4-1
     * 6 = 14/7*2+30/5+1
     * 7.55 = Math.round(Math.sqrt(57)*100/100.0);
     * 0 = 89 + 1 % 5 / (10 % 6)
     * 11 = 17%(10+4)
     *
     * Sæt parenteser så flg kan kompileres og resultatet bliver 19
     * int a=(int)23-9/Math.sqrt(7)
     *
     */
    //løsning

    double myD = 1/3.0;
    float myFl = 1/3.0f;
    double myD2 = 1/3.0;
    double b =  12*(2+2)*(4-1); 
    int z = 14/(7*2)+30/(5+1);
    double a = (Math.round(Math.sqrt(57)*100))/100.0;
    int y = (89 + 1) % 5 / (10 % 6);
    int c = 17%10+4;
    int x = (int)(23-9/Math.sqrt(7));
    System.out.println(myD);
    System.out.println(myFl);
    System.out.printf("%.2f%n",myD2);
    System.out.println(b);
    System.out.println(z);
    System.out.println(y);
    System.out.println(c);
    System.out.println(x);
  }
}
