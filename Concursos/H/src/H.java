
import java.util.ArrayList;
import java.util.Scanner;

public class H {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String palabra;
        String a = "", b = "";
        boolean t = true;
        palabra = l.next();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                a += palabra.charAt(i);

            }
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                t = false;
                System.out.println("N");
                break;
            }
        }
        if (t == true) {
            System.out.println("S");
        }

    }

}
