
import java.util.Scanner;

public class tobbyled {

    static public void recorrimiento(String lado, int t, int n, String mensaje) {
        if (n == t || t == 0) {
            System.out.print(mensaje);
        } else {
            if (lado.equals(" R")) {
                if (n > t) {
                    int posicion = n - t;
                    for (int i = posicion; i < n; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    for (int i = 1; i < posicion + 1; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    System.out.println();
                }
                if (t > n) {
                    int posicion = (n - (t % n));
                    for (int i = posicion - 2; i < n; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    for (int i = 1; i < posicion - 1; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    System.out.println();
                }
            }
            if (lado.equals(" L")) {
                if (n > t) {
                    for (int i =t-1; i <n-1; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    for (int i = 0; i < t; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    
                    System.out.println();
                }
                if (t > n) {
                  //  int posicion = (n - (t % n));
                    for (int i = t%n+1; i < n; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    for (int i = 1; i < t%n+2; i++) {
                        System.out.print(mensaje.charAt(i));
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int t = l.nextInt();
        String lado = l.nextLine();
        String marco1 = l.nextLine();
        String mensaje = l.nextLine();
        String marco2 = l.nextLine();
        n *= 2;
        n += 1;
        t *= 2;
        t += 1;
        System.out.println(marco1);
        recorrimiento(lado, t, n, mensaje);
        System.out.println(marco2);

    }
}
/*
+-------------------+
| | | |T|o|b|b|y|!|!|
+-------------------+
*/
