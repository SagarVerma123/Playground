#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int n, flag = 1;
  char s[100];
  scanf("%[^\n]s", s);
  int i = 0, j = strlen(s)-1;
  while(i<j)
  {
    if(s[i++] != s[j--]){
      flag = 0;
      break;
    }
  }
  if(flag == 0)
    printf("%s is not a palindrome", s);
  else
    printf("%s is a palindrome", s);
  return 0;
}