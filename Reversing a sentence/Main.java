#include<stdio.h>

void reverse(char *start, char *end)
{
  char temp;
  while(start<end)
  {
    temp = *start;
    *start++ = *end;
    *end-- = temp;
  }
}

void reverse_words(char *a)
{
  char *word_begin = a;
  char *temp = a;
  while(*temp)
  {
    temp++;
    if(*temp == '\0')
      reverse(word_begin, temp-1);
    if(*temp == ' ')
    {
      reverse(word_begin, temp-1);
      word_begin = temp+1;
    }
  }
  
  reverse(a, temp-1);
}

int main()
{
  // Type your code here
  char a[100];
  gets(a);
  
  reverse_words(a);

  printf("%s", a);
  return 0;
}