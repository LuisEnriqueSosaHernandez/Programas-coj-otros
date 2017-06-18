#include <stdio.h>
#include <stdlib.h>
int main()
{

    int x;
   scanf("%d",&x);
   int j;
   for(j=0;j<x;j++){
   int a,sum,i;
   scanf("%d",&a);

   sum=a;
   for(i=0;i<3;i++){
    sum+=3;
    sum*=2;
}

   printf("%d\n",sum);
   }
}
