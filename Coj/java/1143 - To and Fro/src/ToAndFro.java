
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
public class ToAndFro {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
       int a=l.nextInt();
       int b=0;
       int k=0;
       String s;
       int cont=0;
       char matriz[][];
       while(a!=0){
           s=l.next();
           for(int i=1;i<=s.length();i++){
               if(a*i==s.length()){
                 b=i;
                 break;
               }
           }
           matriz=new char[b][a];
           for(int i=0;i<b;i++){
               if(cont==0){
               for(int j=0;j<a;j++){
                   matriz[i][j]=s.charAt(k);
                   k++;
                   cont++;
               }
               }else{
               for(int j=a-1;j>=0;j--){
                   matriz[i][j]=s.charAt(k);
                   k++;
                   
               }
               cont=0;
               }
               
           }
          
           for(int i=0;i<a;i++){
               for(int j=0;j<b;j++){
                   System.out.print(matriz[j][i]);
               }
             
           }
           System.out.println("");
           cont=0;
           k=0;
           a=l.nextInt();
           
       }
    }
    
}
