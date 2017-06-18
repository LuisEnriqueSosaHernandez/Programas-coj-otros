
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
public class Main {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String s=l.next();
        while(!s.equals("0")){
            int sum=0;
            while(s.length()>1){
                for(int i=0;i<s.length();i++){
                    sum+=s.charAt(i)-'0';
                }
                s=Integer.toString(sum);
                sum=0;
            }
            System.out.println(s);
            s=l.next();
        }
    }
    
}
