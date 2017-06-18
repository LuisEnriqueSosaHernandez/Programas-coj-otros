#include <stdio.h>
#include <stdlib.h>

int main()
{
long long int x=1;

    int N,K,R,C,i,j,c=0,v=0,cont=0;
    scanf("%d",&N);
    scanf("%d",&K);
    scanf("%d",&R);
    scanf("%d",&C);
    long long int matriz[N][N];
    long long int matriz2[N][N];
    long long int matriz3[N][N];
    long long int matriz4[N][N];
    R=R-1;
    C=C-1;
    for(i=0;i<N;i++){
        for(j=0;j<N;j++){
            matriz[i][j]=x;
            x++;
        }
    }
    if(K>=0){


    for(i=0;i<K;i++){
            cont++;
       if(cont>=4){
        cont=0;
       }

    }
    if(cont==0){
    printf("%lld",matriz[R][C]);
}
    if(cont==1){
    for(i=0;i<N;i++){
        for(j=N-1;j>=0;j--){
           matriz2[v][c]=matriz[j][i];

            c++;
        }
        v++;
        c=0;
    }
    printf("%lld",matriz2[R][C]);
    }
    if(cont==2){
    for(i=0;i<N;i++){
        for(j=N-1;j>=0;j--){
           matriz2[v][c]=matriz[j][i];

            c++;
        }
        v++;
        c=0;
    }
    v=0;
    c=0;
    for(i=0;i<N;i++){
        for(j=N-1;j>=0;j--){
           matriz3[v][c]=matriz2[j][i];

            c++;
        }
        v++;
        c=0;
    }
    printf("%lld",matriz3[R][C]);
    }
     if(cont==3){
    for(i=0;i<N;i++){
        for(j=N-1;j>=0;j--){
           matriz2[v][c]=matriz[j][i];

            c++;
        }
        v++;
        c=0;
    }
    v=0;
    c=0;
    for(i=0;i<N;i++){
        for(j=N-1;j>=0;j--){
           matriz3[v][c]=matriz2[j][i];

            c++;
        }
        v++;
        c=0;
    }
    v=0;
    c=0;
    for(i=0;i<N;i++){
        for(j=N-1;j>=0;j--){
           matriz4[v][c]=matriz3[j][i];

            c++;
        }
        v++;
        c=0;
    }
   printf("%lld",matriz4[R][C]);
    }

    }
/*Volterla en sentido antihorario uvu
SEPARACION -------------------------------------
------------------- NOTABLE PLOX-------
-------------------------------

SE TIENE QUE NOTAR UVU----------------*/
if(K<0){
        K =(K*-1);
    for(i=0;i<K;i++){
            cont++;
       if(cont>=4){
        cont=0;
       }

    }
    if(cont==0){
    printf("%lld",matriz[R][C]);
}
    if(cont==1){
    for(i=N-1;i>=0;i--){
        for(j=0;j<N;j++){
           matriz2[v][c]=matriz[j][i];

            c++;
        }
        v++;
        c=0;
    }
    printf("%lld",matriz2[R][C]);
    }
    if(cont==2){
    for(i=N-1;i>=0;i--){
        for(j=0;j<N;j++){
           matriz2[v][c]=matriz[j][i];

            c++;
        }
        v++;
        c=0;
    }
    v=0;
    c=0;
    for(i=N-1;i>=0;i--){
        for(j=0;j<N;j++){
           matriz3[v][c]=matriz2[j][i];

            c++;
        }
        v++;
        c=0;
    }
    printf("%lld",matriz3[R][C]);
    }
     if(cont==3){
    for(i=N-1;i>=0;i--){
        for(j=0;j<N;j++){
           matriz2[v][c]=matriz[j][i];

            c++;
        }
        v++;
        c=0;
    }
    v=0;
    c=0;
    for(i=N-1;i>=0;i--){
        for(j=0;j<N;j++){
           matriz3[v][c]=matriz2[j][i];

            c++;
        }
        v++;
        c=0;
    }
    v=0;
    c=0;
    for(i=N-1;i>=0;i--){
        for(j=0;j<N;j++){
           matriz4[v][c]=matriz3[j][i];

            c++;
        }
        v++;
        c=0;
    }
   printf("%lld",matriz4[R][C]);
    }

}


    return 0;
}
