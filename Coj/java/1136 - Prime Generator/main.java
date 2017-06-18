import java.util.Scanner;
import java.util.ArrayList;
//Hallar números primos con un rango inicial y final.
public class main{
 public static void main(String arg[]){
	 Scanner l=new Scanner(System.in);
	 ArrayList<String>total=new ArrayList<String>();
  int i,j;
  int a=l.nextInt();
  for(int h=0;h<a;h++){
  boolean esPrimo;
  int rInicial=l.nextInt();//Rango inicial, este debe ser mayor de 1.
  int rFinal =l.nextInt();//Rango final.
  if(rInicial<=1){
	  rInicial=rInicial+1;
  }
  for(i = rInicial;i <= rFinal;i++){
  //recorro ciclo tantas veces como necesite(<= es para incluir el valor de rFinal).
      esPrimo=true;// i es primo hasta que se demuestre lo contrario, jejejejeje.
       for(j = 2;j < i;j++){
       //no coloque j = 1 porque ya sabemos que todo numero es divisible por 1.
       /*j < i es para no incluir el numero a evaluar, pues todo numero es divisible
       por si mismo.*/
       if(i % j == 0){//Si además del 1 y el mismo hay otro divisor, ya no es primo.
         //% devuelve el residuo de i/j
          esPrimo = false;//se demostró que i no es primo.
       }
       }
       if(esPrimo){//Si es primo lo imprimo.
        total.add(""+i);
       }
	   
  }
  total.add("");
  }
  for(i=0;i<total.size();i++){
	  System.out.println(total.get(i));
  }
 }
}