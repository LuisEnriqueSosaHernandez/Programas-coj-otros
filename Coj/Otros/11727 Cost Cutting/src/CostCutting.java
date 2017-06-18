
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author LESH
 */
public class Main {

  
    public static void main(String[] args) {
       int arreglo[]=new int[3];
       Scanner l=new Scanner(System.in);
       int a=l.nextInt();
       for(int j=0;j<a;j++){
           for(int i=0;i<3;i++){
               arreglo[i]=l.nextInt();
           }
           Arrays.sort(arreglo);
           System.out.println("Case "+(j+1)+": "+arreglo[1]);
       }
       
       
               }
    
}
