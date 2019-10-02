#include <stdio.h>
int hcf(int a,int b)
{
  int min,gcd;
  if(a>b)
    min=b;
  else
    min=a;
  while(min>0)
  {
    if(a%min==0 && b%min==0)
    {
      gcd=min;
      break;
    }
    min--;
  }
  return gcd;
}
int main() {
	int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=hcf(a,b);
  int e=hcf(d,c);
  printf("%d",e);
	return 0;
}