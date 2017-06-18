
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arreglo;
        ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
        
        int a;
        boolean verdad=true;
        Scanner l = new Scanner(System.in);
        while (l.hasNextLine()) {
            a = l.nextInt();
            if(a==1){
                arreglo = new int[a];
            for (int i = 0; i < a; i++) {
                arreglo[i] = l.nextInt();
            }
                System.out.println("Not jolly");
            }else{
                
            
            arreglo = new int[a];

            for (int i = 0; i < a; i++) {
                arreglo[i] = l.nextInt();
            }
            for (int i = 0; i < a - 1; i++) {
                arreglo2.add(Math.abs(arreglo[i] - arreglo[i + 1]));
            }
            
            if(arreglo2.get(0)<arreglo2.get(1)){
                
                for(int i=0;i<arreglo2.size()-1;i++){
                    if(arreglo2.get(i)+1!=arreglo2.get(i+1)){
                       System.out.println("Not jolly");
                       verdad=false;
                       break;
                    }
                }
                if(verdad){
                  System.out.println("Jolly");
                }
                
            }else if(arreglo2.get(0)>arreglo2.get(1)){
                
                for(int i=0;i<arreglo2.size()-1;i++){
                    if(arreglo2.get(i)-1!=arreglo2.get(i+1)){
                       System.out.println("Not jolly");
                       verdad=false;
                       break;
                    }
                }
                if(verdad){
                  System.out.println("Jolly");
                }
            }else{
                System.out.println("Not jolly");
            }
           
        }
             verdad=true;
            arreglo2.clear();
    }
    }

}
