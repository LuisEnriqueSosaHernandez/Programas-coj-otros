#include <cstdlib>
#include <iostream>
#include <string.h>
#include <string>
using namespace std;

int main()  //function int main()
{   string num;    //string num  y num es un numero pero en forma de caracteres
while(cin>>num)   // loop que contiene una entreda “cin” las repetira infinitas de veces hasta q de un “break”

{
if(num=="END") break; // si la respuesta es “END” termina el loop
if(num=="1") cout<<"1"<<endl; //si “num” es 1 printea 1
else if(num.length()<2 && num!="1") cout<<"2"<<endl; //si el largo de “num” es menor q 2 y no igual a 1 printea 2
else if(num.length() < 10) cout<<"3"<<endl;//si  el largo de “num” es menor q 10 printea 3
else cout<<"4"<<endl; // si  es mayor igual a 10 printea
}
return 0;//fin del programa
}
