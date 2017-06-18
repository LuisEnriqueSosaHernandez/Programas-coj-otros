
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
public class Genetic {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
       int a=l.nextInt();
       String m,n;
       boolean c=false;
       boolean b=false;
       while(a-->0){
           m=l.next();
           n=l.next();
           if(m.length()>=n.length()){
           int resultado = m.indexOf(n);
         
        if(resultado != -1) {
            c=true;
        }
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='T'){
                b=true;
                break;
            }
        }
        if(c&&b){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
           }else{
               System.out.println("N");
           }
            c=false;
            b=false;
        
       }
    }
    
}
