#include<stdio.h>
int main()
{
  //Type your code here
  int n, k;
  scanf("%d %d", &n, &k);
  int a[n], count[k];
  for(int i=0; i<k; i++)
    count[i] = 0;
  for(int i=0; i<n; i++){
    scanf("%d", &a[i]);
    count[a[i]-1]++;
  }
  for(int i=0; i<k; i++)
    printf("%d %d\n", i+1, count[i]);
  
  return 0;
}