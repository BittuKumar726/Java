import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int b =  sc.nextInt();
      int a=b%10;
  	  int c=b/10;
      System.out.print("Alice must go in path-"+(a+c));
      
		// fill your code
	}
}