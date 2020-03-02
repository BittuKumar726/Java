import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int t = sc.nextInt();
  int s = n/t;
  int o = n%t;
  System.out.print("The number of students in each team is " + s + " and left out is " + o);
// fill your code
}
}