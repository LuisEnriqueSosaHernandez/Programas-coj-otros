
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author LESH
 */
public class AnalysisDeftnessAD {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        DecimalFormat formateador = new DecimalFormat("0.00");
        int r, n = l.nextInt();
        double area, apotema, perimetro, r2;
        while (n-- != 0) {
            r = l.nextInt();
            r2 = r / 2.0;
            apotema = Math.pow(r, 2) - Math.pow(r2, 2);
            apotema = Math.sqrt(apotema);
            perimetro = 6 * r;
            area = (perimetro * apotema) / 2;
            System.out.println(formateador.format(area));
        }
    }

}
