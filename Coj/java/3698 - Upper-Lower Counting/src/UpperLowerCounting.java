
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
public class UpperLowerCounting {

   
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int con1=0,cont2=0,a;
       a=l.nextInt();
       String s=l.next();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)>96){
               cont2++;
           }else{
               con1++;
           }
       }
        System.out.println(con1+" "+cont2);
    }
    
}
