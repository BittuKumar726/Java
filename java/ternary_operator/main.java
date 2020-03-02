import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int a=n%2;
      String v = (a==0) ? "Even" : "Odd";
      System.out.println(v);
      
        // fill your code
    }
}