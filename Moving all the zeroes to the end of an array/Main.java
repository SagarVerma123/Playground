import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b[] = new int[a];
      int i;
        for(i=0;i<a;i++)
        {
           b[i] = in.nextInt();
        }
      for(i=0;i<a;i++)
      {
        if(b[i] != 0)
          System.out.print(b[i]+" ");
      }
      for(i=0;i<a;i++)
      {
        if(b[i] == 0)
          System.out.print(b[i]+" ");
      }
      
    }
}