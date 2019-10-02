import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b[] = new int[a];
      int i,j;
        for(i=0;i<a;i++)
        {
          b[i] = in.nextInt();
        }
      int c = in.nextInt();
      for(i=0;i<a;i++)
      {
        for(j=i+1;j<a;j++)
        {
          int d = b[i] + b[j];
          if(d == c)
          {
            System.out.println(b[i]+", "+b[j]);
          }
        }
      }
    
    }
}