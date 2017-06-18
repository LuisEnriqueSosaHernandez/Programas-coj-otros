

import java.util.Scanner;


public class KPM {

    static String T, P;
    static int n, m;
    static int[] b;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        T = "I DO NOT LIKE SEVENTY SEV BUT SEVENTY SEVENTY SEVEN";
        P = "SEVENTY SEVEN";
        kmpPreproceso();
        kmpSearch();
    }

    static void kpmPreproceso() { 
        b = new int[P.length() + 1];
        n = T.length();
        m = P.length();
        int i = 0, j = -1;
        b[0] = -1; 
        while (i < m) { 
            while (j >= 0 && P.charAt(i) != P.charAt(j)) {
                j = b[j]; 
            }
            i++;
            j++; 
            b[i] = j; 
        }
    } 

    static void kpmSearch() { 
        int i = 0, j = 0; 
        while (i < n) { 
            while (j >= 0 && T.charAt(i) != P.charAt(j)) {
                j = b[j]; 
            }
            i++;
            j++; 
            if (j == m) { 
                System.out.format("P se encuentra en el indice %d en T\n", i - j);
                j = b[j]; 
            }
        }
    }
}
