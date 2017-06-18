
import java.util.Arrays;
import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        long a, b, c, d, e;
        Scanner l = new Scanner(System.in);
        boolean t = true;
        a = l.nextLong();
        b = l.nextLong();
        c = l.nextLong();
        d = l.nextLong();

     if(a<=c&&c%a==0){
        for (long i = a; i <= c; i+=a) {
            if ((i% a == 0) && (i% b != 0) && (c% i == 0) && (d% i != 0)) {
                t = false;
                System.out.println(i);
                break;
            }

        }
     }
        if (t == true) {
            System.out.println(-1);
        }
    }
}
