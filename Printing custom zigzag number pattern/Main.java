#include <stdio.h>
int main() {
	int i,j,k,n,count=2;
  scanf("%d",&n);
  for(i=1;i<n+1;i++){
    for(j=0;j<n;j++){
      if(i%2==1 && j==n-1){
        printf("%d",count);
        count++;
      }
      else if(i%2==0 && j==0){
        printf("%d",count);
        count++;
      }
      else
        printf("%d",i);
    }
    printf("\n");
  }
	return 0;
}