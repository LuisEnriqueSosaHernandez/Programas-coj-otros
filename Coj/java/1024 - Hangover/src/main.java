
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l=new Scanner(System.in);
         Double a=l.nextDouble();
        double x=5;
        double y=6;
        double z=(x/y);
        System.out.println(z);
        int cont=1;
        if(z<a){
        for(int i=1;i<i+1;i++){
            y++;
             z+=(1/(y));  
             cont++;
             System.out.println(y);
             System.out.println(z);
             if(z>=a){
                 break;
             }
              
        }
        }
        System.out.println(cont);
    }
    
}
