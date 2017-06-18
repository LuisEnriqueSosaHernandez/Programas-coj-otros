import java.util.Arrays;
import java.util.Scanner;
public class Ordenamiento{
public  static int [] ordenado(int[] arreglo){
Arrays.sort(arreglo);
return arreglo;
}
public static void main(String[]args){
	
Scanner l=new Scanner(System.in);
int[]arreglito=new int[5];
for(int i=0;i<5;i++){
arreglito[i]=l.nextInt();
}
System.out.println(" Ordenado");
int [] n=ordenado(arreglito);
for(int i=4;i>=0;i--){
System.out.print(n[i]);
}






}
}