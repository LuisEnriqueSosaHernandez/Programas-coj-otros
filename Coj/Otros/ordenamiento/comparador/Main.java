import java.util.Arrays;
public class Main{
public static void main(String[]args){
	Integer [] secuencia=new Integer[4];
	secuencia[0]=new Integer (-100);
	secuencia[1]=new Integer (-10);
	secuencia[2]=new Integer (20);
	secuencia[3]=new Integer (1);
	
	
	for(int i=0;i<secuencia.length;System.out.print(secuencia[i]),i++)
		System.out.print(" ");
	Arrays.sort(secuencia,new SortAbsoluteValue());
	System.out.println("");
	for(int i=0;i<secuencia.length;System.out.print(secuencia[i]),i++)
		System.out.print(" ");
	
}
}