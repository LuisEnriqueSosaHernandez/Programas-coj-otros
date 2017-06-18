
import java.text.DecimalFormat;
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
public class VonNeumannSFly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        DecimalFormat f=new DecimalFormat("0.00");
        int p=l.nextInt();
        int i=0;
        while(i<p){
            int n=l.nextInt();
        double a=l.nextDouble();
        double b=l.nextDouble();
         double c=l.nextDouble();
          double d=l.nextDouble();
          System.out.println(n+" "+f.format(a/(b+c)*d));
          i++;
                  }
    }
    
}
