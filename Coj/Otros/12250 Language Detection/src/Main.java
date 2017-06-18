
import java.util.Scanner;


/**
 *
 * @author LESH
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String s=l.next();
        int cont=1;
        while(!s.equals("#")){
            if(s.equals("HELLO")){
                System.out.println("Case "+cont+": ENGLISH");
                cont++;
            }else if(s.equals("HOLA")){
                System.out.println("Case "+cont+": SPANISH");
                cont++;
        }else if(s.equals("HALLO")){
                System.out.println("Case "+cont+": GERMAN");
                cont++;
        }else if(s.equals("BONJOUR")){
                System.out.println("Case "+cont+": FRENCH");
                cont++;
        }else if(s.endsWith("CIAO")){
                System.out.println("Case "+cont+": ITALIAN");
                cont++;
        }else if(s.equals("ZDRAVSTVUJTE")){
                System.out.println("Case "+cont+": RUSSIAN");
                cont++;
        }else{
                System.out.println("Case "+cont+": UNKNOWN");
                cont++;
        }
            s=l.next();
        }
    }
    
}
