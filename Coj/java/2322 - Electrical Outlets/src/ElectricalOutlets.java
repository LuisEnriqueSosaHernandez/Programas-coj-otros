
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
public class ElectricalOutlets {

    
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int a=l.nextInt(),b,sum=0;
       while(a-->0){
           b=l.nextInt();
           if(b==0){
               System.out.println(1);
           }else{
           for(int i=0;i<b;i++){
               sum+=l.nextInt();
           }
           System.out.println(sum-=(b-1));
       }
           sum=0;
       }
    }
    
}
