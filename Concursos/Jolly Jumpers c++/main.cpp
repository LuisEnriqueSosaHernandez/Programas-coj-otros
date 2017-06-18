#include <iostream>
#include <vector>
#include <math.h>
#include <stdlib.h>

using namespace std;

int main()
{

        vector<int>arreglo2;

        int a;
        bool verdad=true;

        while (cin>>a){

            if(a==1){
                int arreglo[a];
            for (int i = 0; i < a; i++) {
                cin>>arreglo[i];
            }
                cout<<"Jolly"<<endl;
            }else{


            int arreglo[a];

            for (int i = 0; i < a; i++) {
                cin>>arreglo[i];
            }
            for (int i = 0; i < a - 1; i++) {
                arreglo2.push_back(abs(arreglo[i] - arreglo[i + 1]));
            }


            if(arreglo2[0]<arreglo2[1]){

                for(int i=0;i<arreglo2.size()-1;i++){
                    if(arreglo2[i]+1!=arreglo2[i+1]){
                       cout<<"Not jolly"<<endl;
                       verdad=false;
                       break;
                    }
                }
                if(verdad){
                  cout<<"Jolly"<<endl;
                }

            }else if(arreglo2[0]>arreglo2[1]){

                for(int i=0;i<arreglo2.size()-1;i++){
                    if(arreglo2[i]-1!=arreglo2[i+1]){
                       cout<<"Not jolly"<<endl;
                       verdad=false;
                       break;
                    }
                }
                if(verdad){
                  cout<<"Jolly"<<endl;
                }
            }else{
                cout<<"Not jolly"<<endl;
            }

        }
        verdad=true;
            arreglo2.clear();

    }
    return 0;
}
