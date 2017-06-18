import java.util.Scanner;
import java.util.Arrays;
public class main{
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		int i;
		int limite=lector.nextInt();
		int arreglo[]=new int[limite];
		 for(i=0;i<limite;i++){
			arreglo[i]=lector.nextInt();
		}
		Arrays.sort(arreglo);
		for(i=0;i<limite;i++){
			System.out.println(arreglo[i]);
		}
}
}