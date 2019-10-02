import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b[] = new int[a];
      int i;
        for(i=0;i<a;i++)
        {
          b[i] = in.nextInt();
        }
      int max = b[0];
      for(i=1;i<a;i++)
      {
        if(b[i] > max)
        {
          max = b[i];
        }
      }
      System.out.println(max);
      
    }
}