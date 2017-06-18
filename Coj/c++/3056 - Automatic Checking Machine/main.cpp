#include <iostream>

using namespace std;

int main()
{
    bool v=true;
    int arreglo[5];
    int arreglo2[5];

    for(int i=0;i<5;i++){
      cin>>arreglo[i];
    }
    for(int i=0;i<5;i++){
      cin>>arreglo2[i];
    }
    for(int i=0;i<5;i++){
        if(arreglo[i]==arreglo2[i]){
            v=false;
        }
    }
    if(v){
            cout<<"Y";
        }else{
        cout<<"N";
        }
    return 0;
}
