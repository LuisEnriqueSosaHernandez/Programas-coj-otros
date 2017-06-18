#include <stdio.h>
#include <stdlib.h>
/*Recuerden utilizar variables globales para los concursos es lo mejor */
int arregloTodoRancio[] = {69,1,123123,8,23,12};
int tamano = 6;
int x;
/*Declaramos nuestros comparadores todo rancio :v */
int comparador(const void *a, const void *b){
    return *(int *)a - *(int *)b; //Ordena de manera ascendente
}
int comparador2(const void *a, const void *b){
    return *(int *)b - *(int *)a; //Ordena de manera descendente
}

int main(){
    printf("Arreglo Original: \n");
    for(x=0;x<tamano;x++)
        printf("%d ", arregloTodoRancio[x]);
    qsort(arregloTodoRancio,tamano,sizeof(int),comparador);
    printf("\nDespues del quicksort (Ascendente): \n");
    for(x=0;x<tamano;x++)
        printf("%d ", arregloTodoRancio[x]);
    qsort(arregloTodoRancio,tamano,sizeof(int),comparador2);
    printf("\nDespues del quicksort (Descendente): \n");
    for(x=0;x<tamano;x++)
        printf("%d ", arregloTodoRancio[x]);
    return 0;
}
