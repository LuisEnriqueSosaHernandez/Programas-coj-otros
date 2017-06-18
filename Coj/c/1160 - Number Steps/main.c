#include <stdio.h>
#include <stdlib.h>

int main()
{
     int a,x,y,i,sum=0,abajo,arriba;
    scanf("%d",&a);
    for(i=0;i<a;i++){
        scanf("%d",&x);
        scanf("%d",&y);
        sum=x+y;
        arriba=y+y;
        abajo=x+x;
     if((abajo<=y&&arriba<=x)&&x!=0&&y!=0){
        printf("No Number\n");
     }
     else{
    if(sum%2==0){

            if(x%2!=0){
                sum-=1;
        }

     printf("%d\n",sum);
     }
     else{
    printf("No Number\n");
     }
     sum=0;
    }
    }

    return 0;
}
