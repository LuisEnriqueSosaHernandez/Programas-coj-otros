
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
public class DifferentDigits {

    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int a;
       int b;
       String s;
       int cont=0;
       boolean v=true;
       while(l.hasNext()){
           a=l.nextInt();
           b=l.nextInt();
           for(int i=a;i<=b;i++){
           s=Integer.toString(i);
           for(int j=0;j<s.length()-1;j++){
               for(int p=j+1;p<s.length();p++){
                  
                   if(s.charAt(j)==s.charAt(p)){
                       v=false;
                       break;
                   }
               }
               
           }
           if(v){
                   
                
                  cont++; 
                  
               }
           
           v=true;
       }
           System.out.println(cont);
           cont=0;
       }
       
    }
    
}
