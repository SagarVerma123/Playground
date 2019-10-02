#include<stdio.h>
int main()
{
  int n,i,sum,j,flag=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&sum);
  for(i=0;i<n;i++)
  {
    for(j=0;j<i;j++)
    {
      if(a[i]+a[j] == sum)
      {
        flag=1;
        printf("Perfect couple: %d %d\n",a[j],a[i]);
      }
    }
  }
  if(flag==0)
    printf("No perfect couple found!");
}