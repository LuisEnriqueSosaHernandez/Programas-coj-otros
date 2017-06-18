
import java.util.Arrays;
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
public class DemocracyInDanger {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
       int a=l.nextInt();
       int b[]=new int[a];
       int sum=0;
       for(int i=0;i<b.length;i++){
           b[i]=l.nextInt();
       }
       Arrays.sort(b);
       for(int i=0;i<(b.length/2)+1;i++){
           sum+=(b[i]/2)+1;
       }
        System.out.println(sum);
    }
    
}
