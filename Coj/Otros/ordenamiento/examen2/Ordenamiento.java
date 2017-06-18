import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Scanner;
public class Ordenamiento{
public  static ArrayList ordenado(ArrayList arreglo){
Collections.sort(arreglo);
Collections.reverse(arreglo);
return arreglo;
}
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
ArrayList<Integer> secuencia=new ArrayList<Integer>();
ArrayList<Integer> Ordenada;
for(int i=0;i<5;i++){
	secuencia.add(new Integer(l.nextInt()));
}

Ordenada=ordenado(secuencia);



System.out.println(Ordenada);

}
}