
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimpleMedian {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        DecimalFormat redondeo = new DecimalFormat("0.0");
        ArrayList<Double> lista = new ArrayList<Double>();
        int a = l.nextInt();

        double k;
        double r;
        double p;
        while (a != 0) {

            for (int i = 0; i < a; i++) {
                lista.add(l.nextDouble());
            }
            Collections.sort(lista);
            if (lista.size() % 2 != 0) {
                k = lista.size() / 2.0;
               k += 0.5;
                System.out.println(lista.get(((int) k)-1));
             
            } else {
                k = lista.size() / 2.0;
                k-=1;
                r=k+1;
                //r-=1;
               
               p=lista.get((int)r)+lista.get((int)k);
               p/=2.0;
                System.out.println(redondeo.format(p));
            }
            a = l.nextInt();
            lista.clear();
        }
    }
}
