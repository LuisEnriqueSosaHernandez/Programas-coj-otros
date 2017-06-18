
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
public class Rectangle {

    
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int a,b,c,d,e,f;
        a=l.nextInt();
        b=l.nextInt();
        c=l.nextInt();
        d=l.nextInt();
        e=l.nextInt();
        f=l.nextInt();
        
        String s=""+a+""+b+""+c+""+d+""+e+""+f;
        String s1=""+a+""+b;
        String s2=""+c+""+d;
        String s3=""+e+""+f;
        String x="",y="";
        int cont=0;
        for(int i=0;i<s.length();i++){
          for(int j=0;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)){
                  cont++;
              }
          }
          if(cont>3){
              x=""+s.charAt(i);
          }
          cont=0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=x.charAt(0)){
                y+=s.charAt(i);
            }
        }
       if(s1.equals(y)||s2.equals(y)||s3.equals(y)){
           System.out.println(y.charAt(1)+" "+y.charAt(0));
       }else{
           System.out.println(y.charAt(0)+" "+y.charAt(1));
       }
        
}
}
