import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class inversion{
public static void main(String[]args){
ArrayList<socios> list=new ArrayList<socios>();
Scanner l=new Scanner(System.in);
long inversion;
String nivel;
int i=0;
while(i<5){
nivel=l.next();

inversion=l.nextLong();
list.add(new socios(nivel,inversion));
}
Comparator<socios>comparador=new Comparator<socios>(){
public long compare(socios a,socios b){
long resultado=Long.compare(a.inversion(),b.inversion());
if(resultado!=0){
return resultado;
}

}

};
Collections.sort(list,comparador);
for(int u=list.size()-1;u>=0;u--){
System.out.println(list.get(u));
}
}
}

class socios{
long inversion;
String nivel;
public socios(String nivel,long inversion){
this.nivel=nivel;
this.inversion=inversion;
}
public String toString(){
return nivel;

}

public String nivel(){
return nivel;
}
public long inversion(){
return inversion;
}

}