#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int arreglo[] = {1,2,3,4,5,6};
    vector<int> vec(arreglo, arreglo+6);
    int n;
    cin >> n;
    if(binary_search(vec.begin(),vec.end(),n))
        cout << "Se encontro el elemento :D";
    else
        cout << "No se encontro :c";
}
