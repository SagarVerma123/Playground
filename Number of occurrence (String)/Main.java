#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[100], b[100], count = 0, ch1, ch2;
  int a_len, b_len;
  gets(a);
  gets(b);
  a_len = strlen(a);
  b_len = strlen(b);
  
  for(int i=0; i<a_len-b_len+1; i++)
  {
    int match = 1;
    for(int j=0; j<b_len; j++)
    {
      ch1 = a[i+j];
      ch2 = b[j];
      if(a[i+j]>='A' && a[i+j]<='Z')
        ch1 = a[i+j]+32;
      if(b[j]>='A' && b[j]<='Z')
        ch2 = b[j]+32;
      if(ch1 != ch2)
        match = 0;
    }
    if(match == 1)
      count++;
  }
  
  printf("%d", count);
  
  return 0;
}