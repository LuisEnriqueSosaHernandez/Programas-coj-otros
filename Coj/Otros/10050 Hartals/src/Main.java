
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author LESH
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        ArrayList<Integer> lista=new ArrayList<Integer>();
        int n=l.nextInt();
        while(n-->0){
            int semana=1;
            int perdidos=0;
            int dias=l.nextInt();
            int tam=l.nextInt();
            for(int i=0;i<tam;i++){
                lista.add(l.nextInt());
            }
            for(int i=1;i<=dias;i++){
                for(int j=0;j<lista.size();j++){
                    if(i%lista.get(j)==0&&semana!=6&&semana!=7){
                        perdidos++;
                        break;
                    }
                }
                if(semana>7){
                    semana=1;
                }
                semana++;
            }
            System.out.println(perdidos);
            lista.clear();
        }
        
    }
    
}
