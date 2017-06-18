

/**
 *
 * @author Manuel Angel Muñoz S
 */
public class ComparacionContSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]= new int[10000];
        int k=100;
        long tiempo= System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) { //llenado
                a[j]=(int)(Math.random()*k);
            }
            a=contSort1(a,k);
        }
        System.out.println("tiempo del algoritmo 1: " + (System.currentTimeMillis()-tiempo));
        tiempo= System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) { //llenado
                a[j]=(int)(Math.random()*k);
            }
            a=contSort2(a,k);
        }
        System.out.println("tiempo del algoritmo 2: " + (System.currentTimeMillis()-tiempo));
    }
    /**
     * Version del algoritmo que hice como yo lo entendi
     * @param a
     * @param k
     * @return 
     */
    public static int[] contSort1(int []a, int k){
        int alf[]= new int[k];
        for (int i = 0; i < a.length; i++) {
            alf[a[i]]++;
        }
        int n=0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < alf[i]; j++) {
                a[n++]=i;
            }
        }
        return a;
    }
    /**
     * Version del algoritmo que puso el profe
     * @param a
     * @param k
     * @return 
     */
    public static int[] contSort2(int a[], int k){
        int c[]= new int[k];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            c[i]+=c[i-1];
        }
        int b[]= new int[a.length];
        
        for (int i =a.length-1; i>=0; i--) {
            b[--c[a[i]]]=a[i];
        }
        return b;
    }
}
