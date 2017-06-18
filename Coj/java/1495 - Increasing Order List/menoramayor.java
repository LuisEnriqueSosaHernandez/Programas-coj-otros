import java.util.Scanner;
public class menoramayor{
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		int limite,i,j,aux;
		limite=lector.nextInt();
		int arreglo[]=new int[limite];
		
           for(i=0;i<limite;i++){
			arreglo[i]=lector.nextInt();
		}
		for(i=0;i<limite;i++){
			for(j=i+1;j<limite;j++){
				if(arreglo[i]>arreglo[j]){
					aux=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
				}
			}
		}
		for(i=0;i<limite;i++){
			System.out.println(arreglo[i]);
		}
}
}