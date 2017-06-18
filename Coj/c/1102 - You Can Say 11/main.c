#include <stdio.h>
#include <stdlib.h>


int main()
{
   int a,b;

     while(a!=0){

    scanf("%d",&a);
if(a!=0){

    b=a%11;
    if(b!=0){
        printf("%d is not a multiple of 11.\n",a);
    }
    else{
        printf("%d is a multiple of 11.\n",a);
   }
    }
     }

   }

