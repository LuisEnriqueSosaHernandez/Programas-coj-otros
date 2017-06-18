
import java.util.Scanner;


/**
 *
 * @author LESH
 */
public class Main {

    
    public static void main(String[] args) {
       Scanner l=new Scanner(System.in);
       int n=l.nextInt();
       String s;
       int serie[];
       while(n-->0){
           serie=new int[10];
           String num="";
           int tam=l.nextInt();
           for(int i=1;i<=tam;i++){
               s=Integer.toString(i);
               for(int j=0;j<s.length();j++){
                   if(s.charAt(j)=='0'){
                       serie[0]++;
                   }
                   if(s.charAt(j)=='1'){
                       serie[1]++;
                   }
                   if(s.charAt(j)=='2'){
                       serie[2]++;
                   }
                   if(s.charAt(j)=='3'){
                       serie[3]++;
                   }
                   if(s.charAt(j)=='4'){
                       serie[4]++;
                   }
                   if(s.charAt(j)=='5'){
                       serie[5]++;
                   }
                   if(s.charAt(j)=='6'){
                       serie[6]++;
                   }
                   if(s.charAt(j)=='7'){
                       serie[7]++;
                   }
                   if(s.charAt(j)=='8'){
                       serie[8]++;
                   }
                   if(s.charAt(j)=='9'){
                       serie[9]++;
                   }
               }
               
           }
           for(int x=0;x<serie.length;x++){
               if(x<9){
                   System.out.print(serie[x]+" ");
               }else{
                   System.out.print(serie[x]);
               }
               }
           System.out.println("");
       }
    }
    
}
