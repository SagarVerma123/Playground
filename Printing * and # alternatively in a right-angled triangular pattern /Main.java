#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j,num=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(num%2==0)
        printf("#");
      else
        printf("*");
               num++;
     }
    printf("\n");
  }
  	return 0;
}