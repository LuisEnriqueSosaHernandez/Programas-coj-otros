
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author LESH
 */
public class Necklace {

   
    public static void main(String[] args) {
        int Vo,Vtotal;
        ArrayList<Double> n=new ArrayList<Double>();
        
        Scanner l=new Scanner(System.in);
        Vtotal=l.nextInt();
        Vo=l.nextInt();
        
        
   while(Vtotal!=0&&Vo!=0){
       double V=0,D;
       int numDsicos=0;
       double max=0;
       for(int i=0;i<Vtotal/2;i++){
           
           V=Vtotal/(i+1);
           //System.out.println(V);
           D=0.3*Math.sqrt(V-Vo);
           D*=(i+1);
           //System.out.println(D);
           if(max<D){
               max=D;
               numDsicos=i+1;
              n.add(max);
               
           }
           V=0;
       }
       
       System.out.println(numDsicos);
       
           System.out.println(0);
       
       Vtotal=l.nextInt();
        Vo=l.nextInt();
   }     
    }
    
}
