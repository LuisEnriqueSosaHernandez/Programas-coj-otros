
import java.util.HashSet;
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
public class AnotherSortingProblem {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int a = l.nextInt();
        int b;
        int arreglo[];
        int cont = 0;
        while (a-- > 0) {
            b = l.nextInt();
            arreglo = new int[b];
            for (int i = 0; i<b; i++) {
                arreglo[i] = l.nextInt();
                if (arreglo[i] != i+1) {
                    cont++;
                }
            }
            System.out.println(cont);
            cont=0;
        }

    }

}
