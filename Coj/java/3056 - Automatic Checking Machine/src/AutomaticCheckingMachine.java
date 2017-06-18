
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
public class AutomaticCheckingMachine {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a,b;
        String s="";
        String s2="";
        boolean v=true;
       for(int i=0;i<5;i++){
           a=l.nextInt();
           s+=Integer.toString(a);
       }
       for(int i=0;i<5;i++){
           b=l.nextInt();
           s2+=Integer.toString(b);
       }
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==s2.charAt(i)){
               v=false;
           }
       }
       if(v){
           System.out.println("Y");
       }else{
           System.out.println("N");
       }
    }
    
}
