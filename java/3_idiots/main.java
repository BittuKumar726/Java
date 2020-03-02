import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    
    double X = (x1+x2)/(2.0);
    
    double Y = (y1+y2)/(2.0);
    System.out.println("Binoy's house is located at "+"(" + X +","+ Y +")");
	

    // fill your code
  }
}