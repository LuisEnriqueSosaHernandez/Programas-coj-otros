
import java.util.Scanner;



/**
 *
 * @author LESH
 */
public class Main {

   
    public static void main(String[] args) {
       
       Scanner l=new Scanner(System.in);
       String b=l.nextLine();
       int donaciones=0;
       int a=Integer.parseInt(b);
       while(a-->0){
           
           String s=l.nextLine();
           
          
          String s2="";
           if(s.equals("report")){
              System.out.println(donaciones);
           }else{
               for(int i=7;i<s.length();i++){
                   s2+=""+s.charAt(i);
                 
               }
              donaciones+=Integer.parseInt(s2);
           }
       }
    }
    
}
