#include <iostream>
#include <vector> //Vector (?
#include <algorithm> //Sort
#define FOR(i,a) for(int i=0;i<int(a);i++)
using namespace std;
typedef vector<int> vi;
int miArreglo[] = {10, 10, 69, 1, 69696969, 30, -1};
bool comparadorMenor(int x,int y){
    return x < y;
}
bool comparadorMayor(int x,int y){
    return x > y;
}
/* Tambien podemos usar un objeto de un struct o clase como comparador O: */
struct MiClaseRancia{
    bool operator() (int x,int y){ //Sobreescribimos operator
        return x < y;
    }
} MiObjetoRancio;

int main(){
    vi otroArreglo(miArreglo, miArreglo + 7);
    otroArreglo.push_back(20);
    cout << "MiArreglo Original: \n";
    FOR(x,7) cout << " " << miArreglo[x];
    cout << "\n\nOtroArreglo Original: \n";
    FOR(x,otroArreglo.size()) cout << " " << otroArreglo[x];
    //Veamos la diferencia de como utilizar sort con los diferentes vectores
    sort(miArreglo, miArreglo+7,comparadorMenor); //Podríamos omitir el comparador ya que por default lo hace de manera Ascendente
    sort(otroArreglo.begin(),otroArreglo.end(),comparadorMayor); //En este caso podriamos hacerlo de varias maneras
    /*
    sort(otroArreglo.rbegin(),otroArreglo.rend()); <- Esto es equivalente a lo de que arriba
    sort(otroArreglo.begin(),otroArreglo.end(),greater<int>()); <- Podemos utilizar esta clase que contiene un comparador para descendente
    */
    cout << "\n\nMiArreglo Ordenado: \n";
    FOR(x,7) cout << " " << miArreglo[x];
    cout << "\n\nOtroArreglo Ordenado: \n";
    FOR(x,otroArreglo.size()) cout << " " << otroArreglo[x];
    cout << "\n\nOtroArreglo Ordenado (Utilizando el Objeto de la Clase MiClaseRancia):\n";
    sort(otroArreglo.begin(),otroArreglo.end(),MiObjetoRancio);
    FOR(x,otroArreglo.size()) cout << " " << otroArreglo[x];
}
