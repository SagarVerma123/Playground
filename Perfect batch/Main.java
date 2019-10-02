/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int a[n];
  
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  
  int sum1, flag = 1, sum = a[0]+a[1]+a[2];
  
  for(int i=3; i<n && i+3<=n; i+=3)
  {
    sum1 = a[i]+a[i+1]+a[i+2];
    if(sum != sum1)
    {
      flag = 0;
      break;
    }
  }
  if(flag == 1)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}