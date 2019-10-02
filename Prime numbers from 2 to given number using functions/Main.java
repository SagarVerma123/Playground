#include<stdio.h>
int prime(int n)
{
  int c=0;
  for(int i=2;i<n;i++)
  {
    if(n%i==0)
      c=c+1;
  }
  return c;
}
int main(){
    int n,d;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    d=prime(i);
    if(d==0)
      printf("%d\n",i);
    else
      continue;
  }
  
    return 0;
}