
import java.util.Scanner;


public class A {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a,b,c;
        
       a=l.nextInt();
       b=l.nextInt();
       c=l.nextInt();
       if((a+b==c)||(b+c==a)||(c+a==b)||(a==b)||(a==c)||(b==c)){
           System.out.println("S");
       }else{
            System.out.println("N");
       }       
       
    }
    
}
