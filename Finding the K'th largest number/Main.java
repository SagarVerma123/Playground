#include<stdio.h>
int main()
{
//Type your code here
  int n, k;
  scanf("%d", &n);
  int a[n];
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  scanf("%d", &k);
  for(int i=0; i<n-1; i++)
  {
    for(int j=i+1; j<n; j++)
    {
      if(a[i]<a[j])
      {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
  }
  printf("%d", a[k-1]);
return 0;
}