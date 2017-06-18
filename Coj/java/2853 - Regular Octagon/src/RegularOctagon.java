
import java.text.DecimalFormat;
import java.util.Scanner;


/* @author LESH
 */
public class RegularOctagon {

    
    public static void main(String[] args) {
        
        double inicial;
        double apotema;
        double anguloRadianes;
        DecimalFormat formateador = new DecimalFormat("0.000");
        Scanner l=new Scanner(System.in);
        int a=l.nextInt();
        while(a!=0){
            inicial=a;
            apotema=inicial/2.00;
            anguloRadianes = Math.toRadians(180);
                   
            System.out.println(formateador.format(Math.pow(apotema, 2)*8*Math.tan(anguloRadianes/8)));
            
            a=l.nextInt();
            
        }
      
        
    }
    
}
