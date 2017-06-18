4#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,i;
    int h=1;
    scanf("%d",&n);
if(n>0){
    for(i=2;i<=n;i++){
        h=h+i;
    }
    printf("%d",h);
}


}
