import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int res;
    res = power(a,b);
    System.out.println(res);
  }
  public static int power(int a,int b)
  {
    int i=1,prod=1;
    while(i<=b)
    {
      prod = prod*a;
        i=i+1;
    }
    return prod;
  }
}