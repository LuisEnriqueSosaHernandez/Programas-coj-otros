
import java.util.Scanner;



/**
 *
 * @author LESH
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
      int a=l.nextInt();
      
      while(a-->0){
          int con1=0,cont2=0;
          String s=l.next();
          if(s.length()==3){
              for(int j=0;j<3;j++){
                 if(s.charAt(j)=='t'||s.charAt(j)=='w'||s.charAt(j)=='o') {
                   con1++;  
                 }
                 if(s.charAt(j)=='o'||s.charAt(j)=='n'||s.charAt(j)=='e'){
                   cont2++;  
                 }
              }
              if(con1>cont2){
                  System.out.println(2);
              }else{
                  System.out.println(1);
              }
          }else{
              System.out.println(3);
          }
      }
    }
    
}
