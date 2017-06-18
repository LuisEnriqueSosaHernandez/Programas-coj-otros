#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
struct Equipos{
    int problemasResueltos;
    int tiempo;
};

bool comparador(Equipos a, Equipos b){
    if(a.problemasResueltos != b.problemasResueltos)
        return a.problemasResueltos > b.problemasResueltos;
    return a.tiempo < b.tiempo;
}
/* Caso prueba:
5
10 450
3 120
9 200
10 410
6 80
--------

10 410
10 450
9 200
6 80
3 120
*/
int main(){
    vector<Equipos> eq;
    Equipos o;
    int n;
    cin >> n;
    for(int x=0;x<n;x++){
        cin >> o.problemasResueltos >> o.tiempo;
        eq.push_back(o);
    }
    cout << "\n";
    stable_sort(eq.begin(),eq.end(),comparador);
    for(int x=0;x<n;x++){
        cout <<  eq[x].problemasResueltos << " " << eq[x].tiempo << "\n";
    }
}
