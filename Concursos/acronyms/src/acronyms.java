
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class acronyms {

   

    static public String checar(String palabra, String palabra2) {
        String a = "yes";
         String ward;
        ArrayList<String> guardado = new ArrayList<String>();
        ArrayList<String> guardado2 = new ArrayList<String>();
        StringTokenizer token = new StringTokenizer(palabra);
        StringTokenizer token2 = new StringTokenizer(palabra2);
        while (token.hasMoreTokens()) {
            ward = token.nextToken();
            //guardado.add(ward.charAt(0)+"");
            guardado.add(ward);
        }
        while (token2.hasMoreTokens()) {
            ward = token2.nextToken();
            // guardado2.add(ward.charAt(0)+"");
            guardado2.add(ward);
        }
        if (guardado.size() == guardado2.size()) {
            for (int i = 0; i < guardado.size(); i++) {
                if (guardado.get(i).charAt(0) != guardado2.get(i).charAt(0)) {
                    
                    a = "no";
                    break;
                }
            }
        } else {
            a = "no";

        }

        return a;
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String palabra, palabra2;
        while (l.hasNextLine()) {
            palabra = l.nextLine();
            palabra2 = l.nextLine();
            System.out.println(checar(palabra, palabra2));
        }

    }

}
