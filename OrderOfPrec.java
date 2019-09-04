public class OrderOfPrec
{
  public static void main(String[] args)
  {
    /*
     * OPGAVE: 
     *
     * 1) ret så flg. bliver korrekt (brug printf, parenteser, typecasting etc)
     * 144 = 12*2+2*4-1
     * 7.55 = Math.round(Math.sqrt(57)*100/100.0);
     *
     * Sæt parenteser så flg blir ok:
     * int a=(int)23-9/Math.sqrt(7)
     *
     */
    //løsning
    double f = 1/3.0;
    double a = (Math.round(Math.sqrt(57)*100))/100.0;
    double b =  12*(2+2)*(4-1); 
    int x = (int)(23-9/Math.sqrt(7));
    System.out.println(a);
    System.out.println(b);
    System.out.println(x);
  }
}
