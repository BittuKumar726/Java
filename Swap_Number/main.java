import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc = new Scanner(System.in);
      int a,b,c,d;
      a=sc.nextInt();
      b=sc.nextInt();
      c = a+b;
      b = a;
      a = c-a;
      
      System.out.println(a+"\n"+b);
    }
}