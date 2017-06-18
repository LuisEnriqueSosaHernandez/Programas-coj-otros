import java.lang.StringBuilder;
public class main2{
public static void main(String[]args){
long inicio,fin,tiempo;
StringBuilder a=new StringBuilder("Hola");
	inicio=System.currentTimeMillis();
	int n=100000;
	for(int i=0;i<n;i++){
	a.append("Hola");
}
	System.out.println(a);
	
	fin=System.currentTimeMillis();
tiempo=fin-inicio;

System.out.println(tiempo);




}
}