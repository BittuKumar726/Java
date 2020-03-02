import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int p = sc.nextInt();
      int t = sc.nextInt();
      float r = sc.nextFloat();
      float I = (p*r*t)/100;
      System.out.print(I);
        // fill your code
    }
}