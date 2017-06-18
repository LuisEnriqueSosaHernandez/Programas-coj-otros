
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author LESH
 */
public class SideOfTheRhombus {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        DecimalFormat formateador = new DecimalFormat("0.00");
       int n=l.nextInt();
       double a,s;
       while(n--!=0){
           a=l.nextDouble();
           s=l.nextDouble();
           s/=2;
           s=(Math.pow(s,2))*2;
           s=Math.sqrt(s);
            System.out.println(formateador.format(s-a));
       }
    }
    
}
