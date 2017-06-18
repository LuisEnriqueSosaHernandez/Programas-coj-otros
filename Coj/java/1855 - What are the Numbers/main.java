import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
HashSet<String> lista = new HashSet<String>();
ArrayList<String> repetidos = new ArrayList<String>();

int a=l.nextInt();
for(int j=0;j<a;j++){

int e=l.nextInt();

for(int i=0;i<e;i++){
String x=l.next();
if(lista.add(x)){

}else{
repetidos.add(x);
}
}
if(repetidos.size()==0){
	System.out.println("Not found!");
}else{
for(int i=0;i<repetidos.size();i++){
	System.out.println(repetidos.get(i));
}
}
lista.clear();
repetidos.clear();
}
}

}