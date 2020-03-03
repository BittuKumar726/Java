import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int o = ((x*a)-(x*b))-100;
      System.out.print("The profit obtained is Rs."+o);
		// fill your code
	}
}