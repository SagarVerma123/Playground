import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b[] = new int[a];
      int i,j,k;
        for(i=0;i<a;i++)
        {
          b[i] = in.nextInt();
        }
      for(i=0;i<a;i++)
      {
        for(j=i+1;j<a;j++)
        {
          for(k=j+1;k<a;k++)
          {
            System.out.print("("+b[i]+", "+b[j]+", "+b[k]+")"+" ");
          }
        }
        if(i<a-1)
          System.out.println();
    }
}
}