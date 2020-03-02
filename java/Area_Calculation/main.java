import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      float r1;
      float pi=3.14f,A;
      int s,b,l,A1,A2;
      s=sc.nextInt();
      A1=s*s;
      l=sc.nextInt();
      b=sc.nextInt();
      A2=l*b;
      r1=sc.nextFloat();
      A=pi*r1*r1;  
      System.out.println(A1);
      
      System.out.println(A2);
      
      System.out.printf("%.2f",A);
    }
}