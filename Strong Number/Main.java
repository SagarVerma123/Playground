#include <stdio.h>
int main() {
	//Type your code
  int n,i,p=1,s=0,r,c;
  scanf("%d",&n);
        c=n;
  while(n>0)
        {
          p=1;
          r=n%10;
          for(i=1;i<=r;i++)
            p=p*i;
          s+=p;
          n=n/10;
        }
               if(s==c)
                  printf("Yes");
               else
                  printf("No");
	return 0;
}