#include <iostream>
#include <algorithm>
#include <vector>
#define FOR(x,a) for(int x=0;x<int(a);x++)
using namespace std;
typedef vector<double> vd;
bool comparador(double x, double y){
    return (int)x < (int)y;
}
double arregloDeDoubles[] = {3.14, 1.41, 2.72, 4.67, 1.73, 1.32, 1.62, 2.58};
int main(){
    vd a(arregloDeDoubles,arregloDeDoubles+8);
    cout << "Utilizando la comparacion default del sort: \n";
    stable_sort(a.begin(),a.end());
    FOR(x,a.size()) cout << " " << a[x];
    a.assign(arregloDeDoubles,arregloDeDoubles+8);
    cout << "\nUtilizando nuestro comparador todo rancio: \n";
    stable_sort(a.begin(),a.end(),comparador);
    FOR(x,a.size()) cout << " " << a[x];
}
