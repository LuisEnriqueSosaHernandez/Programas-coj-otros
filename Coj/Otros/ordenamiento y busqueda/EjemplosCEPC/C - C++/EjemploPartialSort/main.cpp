#include <iostream>
#include <algorithm>
#include <vector>
#define FOR(x,a) for(int x=0;x<int(a);x++)
using namespace std;

int main(){
    int miArreglo[] = {9,8,7,6,5,4,3,2,1};
    vector<int> otroArreglo(miArreglo, miArreglo + 9);
    cout << "Sin Ordenar: \n";
    FOR(x,otroArreglo.size()) cout << " " << otroArreglo[x];
    cout << "\n\nCon Partial Sort:\n";
    partial_sort(otroArreglo.begin(),otroArreglo.begin()+4,otroArreglo.end());
    FOR(x,otroArreglo.size()) cout << " " << otroArreglo[x];
}
