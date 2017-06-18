
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
public class Cryptoquote {

    
    public static void main(String[] args) {
       char []a={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       Scanner l=new Scanner(System.in);
       int c=l.nextInt();
       
       String s,s2,s3="";
      for(int k=1;k<=c;k++){
           s=l.nextLine();
           s=l.nextLine();
           s2=l.next();
           
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)==' '){
                  s3+=" "; 
               }else{
               for(int j=0;j<26;j++){
                   if(a[j]==s.charAt(i)){
                      s3+=""+s2.charAt(j);
                   }
               }
               }
           }
           System.out.println(k+" "+s3);
           s3="";
           
       }
       
    
}
}
