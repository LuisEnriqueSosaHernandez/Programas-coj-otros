#include <stdio.h>
#include <stdlib.h>

int main()
{
   int i,a,t,r=0;
   scanf("%d",&a);
   for(i=1;i<=a;i++){
    scanf("%d",&t);
    r=r+t;
   }
   printf("%d",r);
}
