import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in  = new Scanner(System.in);
      String a = in.nextLine();
      StringBuilder sb = new StringBuilder(a);
      int front=0;
      int end= a.length()-1;
      boolean e = true;
      while(front < end)
      {
        if(sb.charAt(front) != sb.charAt(end))
         e = false;
        front++;
        end--;
      }
      if(e==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}