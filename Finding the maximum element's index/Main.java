import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
int n = in.nextInt();
int list[] = new int[n];
    int index;
    for( index = 0; index < n; index++)
{
list[index] = in.nextInt();
}
    int max = list[0];
    for( index=1;index<n;index++)
    {
       if(list[index]>max)
         max=list[index];
    }
    for(index=0;index<n;index++)
    {
      if(list[index]==max)
        System.out.println(index);
    }
  }
}