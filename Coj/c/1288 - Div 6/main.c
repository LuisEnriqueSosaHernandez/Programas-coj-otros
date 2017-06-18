#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i,c,a;
    scanf("%d",&c);
    if(c>=1&&c<=25){
    for(i=0;i<c;i++){
        scanf("%d",&a);
        if(a<=1000){
        if(a%6==0){
            printf("YES\n");
        }else{
        printf("NO\n");
        }
    }
    }
    }

}
