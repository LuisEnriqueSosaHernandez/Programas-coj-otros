
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
public class TheBeautifulNumbers {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
       String s=l.next();
       String s2=l.next();
       String s3="";
       for(int i=0;i<s2.length();i++){
           s+=s2.charAt(i);
       }
       for(int i=s.length()-1;i>=0;i--){
           s3+=s.charAt(i);
       }
       if(s.equals(s3)){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
               
    }
    
}
