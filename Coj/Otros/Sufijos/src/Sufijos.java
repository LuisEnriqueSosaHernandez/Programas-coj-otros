
public class Sufijos {

    // acepta hasta 100,000 caracteres

    
    public static void main(String[] args) {

        String a = "Papap";
        String b = "ap";
        
        //System.out.println(Busqueda(a,b));
        Busqueda(a,b);
    }

    public static void Busqueda(String a, String b) {
        if (b.length() > a.length()) {
            System.out.println("0");
        }

        int cont = 0, sub;
        while ((sub = a.indexOf(b)) != -1) {
            cont++;
            a = a.substring(sub + 1);
        }

        System.out.println(cont);
    }

}