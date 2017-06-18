
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LESH
 */
public class InDebt {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int b, acomulado = 0, cont = 0, a = l.nextInt();
        while (a != -1) {
            for (int i = 0; i < a; i++) {
                b = l.nextInt();
                acomulado += b;
                if (acomulado % 100 == 0) {
                    cont++;
                    acomulado = 0;
                }

            }
            System.out.println(cont);
            cont = 0;
            acomulado = 0;
            a = l.nextInt();
        }

    }

}
