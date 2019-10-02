import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b[] = new int[a];
      int i,e=0,f=0,flag=0,flag1=0;
        for(i=0;i<a;i++)
        {
          b[i] = in.nextInt();
        }
            int c = in.nextInt();
      int d = in.nextInt();
      for(i=0;i<a;i++)
      {
        if(b[i]==c)
        {
          flag=1;
          e=i;
          break;
        }
      }
      for(i=0;i<a;i++){
        if(b[i]==d)
        {
          flag1=1;
          f=i;
          break;
        }
      }

      if(flag==1){
        System.out.println(e);}
      else{
        System.out.println("-1");}
      if(flag1==1){
        System.out.println(f);}
      else{
        System.out.println("-1");}
      
      
      
    }
}