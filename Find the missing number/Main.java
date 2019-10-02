#include<stdio.h>
int main()
{
  //Type your code here
  int n, found;
  scanf("%d", &n);
  int a[n];
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  for(int i=1; i<=n; i++)
  {
    found = 0;
    for(int j=0; j<n; j++)
    {
      if(a[j] == i){
        found = 1;
        break;
      }
    }
    if(found == 0){
      printf("%d", i);
      break;
    }
  }
    
  return 0;
}