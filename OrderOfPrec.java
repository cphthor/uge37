public class OrderOfPrec
{
  public static void main(String[] args)
  {
    /*
     * OPGAVE: 
     *
     * 1) ret så flg. bliver korrekt (brug printf, parenteser, typecasting etc)
     * 144 = 12*2+2*4-1
     * 6 = 14/7*2+30/5+1
     * 7.55 = Math.round(Math.sqrt(57)*100/100.0);
     * 0 = 89 + 1 % 5 / (10 % 6)
     * 11 = 17%(10+4)
     *
     * Sæt parenteser så flg kan kompileres
     * int a=(int)23-9/Math.sqrt(7)
     *
     */
    //løsning
    double f = 1/3.0;
    double a = (Math.round(Math.sqrt(57)*100))/100.0;
    double b =  12*(2+2)*(4-1); 
    int x = (int)(23-9/Math.sqrt(7));
    int y = (89 + 1) % 5 / (10 % 6);
    int c = 17%10+4;
    System.out.println(a);
    System.out.println(b);
    System.out.println(x);
    System.out.println(y);
    System.out.println(c);
  }
}
