
public class main{
public static void main(String[]args){
	long inicio,fin,tiempo;
	inicio=System.currentTimeMillis();
	int n=100000;
String a="Hola";
for(int i=0;i<n;i++){
	a+="Hola";

}
System.out.println(a);
fin=System.currentTimeMillis();

tiempo=fin-inicio;


System.out.println(tiempo);
}
}