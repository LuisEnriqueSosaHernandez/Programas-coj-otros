
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class MysteriousNumber {

    
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
      int a=l.nextInt(),b,c;
      int cont=0;
      String s;
      int arreglo[];
      while(a-->0){
          b=l.nextInt();
          s=l.next();
          c=l.nextInt();
          arreglo=new int[b];
          for(int i=1;i<=b;i++){
             if(s.equals("odd")){
                if(i%2==0){
                    arreglo[cont]=i;
                    cont++;
                } 
             }else{
                 if(i%2!=0){
                    arreglo[cont]=i;
                    cont++;
                 }
             }
          }
          System.out.println(arreglo[c-1]);
          cont=0;
      }
    }
    
}
