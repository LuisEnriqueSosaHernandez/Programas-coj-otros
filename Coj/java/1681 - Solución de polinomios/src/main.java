
import java.util.Scanner;
/*
El radicando b2 – 4ac se denomina discriminante y se simboliza por Δ. El número de soluciones (llamadas también raíces) depende del signo de Δ y se puede determinar incluso antes de resolver la ecuación.

Δ=(b*b)-(4*a*c);

Entonces, estudiando el signo del discriminante (una vez resuelto), podemos saber el número de soluciones que posee:

Si Δ es positivo, la ecuación tiene dos soluciones.

Si Δ es negativo, la ecuación no tiene solución.

Si Δ es cero, la ecuación tiene una única solución.
*/

public class main {
    public static void main(String[] args) {
       int a,b,c;
       Scanner l=new Scanner(System.in);
       a=l.nextInt();
       b=l.nextInt();
       c=l.nextInt();
       if((b*b)-(4*a*c)>=0){
            //System.out.println(b*b-4*a*c);
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
    
}
