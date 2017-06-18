
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author LESH
 */
public class FindTheWeddingCakeVolume {

    private double resultado;

    private double volumen(int a, int b) {

        return resultado=Math.PI * Math.pow(a, 2) * b;

    }

    public static void main(String[] args) {
        int n, a, b;
        double volumen = 0;
        DecimalFormat formateador = new DecimalFormat("0.00");
        FindTheWeddingCakeVolume f = new FindTheWeddingCakeVolume();
        Scanner l = new Scanner(System.in);
        n = l.nextInt();
        while (n-- != 0) {
            volumen = 0;
            int c = l.nextInt();
            for (int i = 0; i < c; i++) {
                a = l.nextInt();
                b = l.nextInt();
                volumen += f.volumen(a, b);
            }
            System.out.println(formateador.format(volumen));
            
        }
    }

}
