#include <stdio.h>
int greatest(int a,int b)
{
  if(a>b)
    return a;
  else
    return b;
}
int main(){
	int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=greatest(a,b);
  int e=greatest(d,c);
  printf("%d",e);
  	return 0;
}