public class problema1{
public static void main(String[]args){
	String a="En mi proxima vida, creere en la reencarnacion";
	
	System.out.println("Su longitud es: "+a.length());
	System.out.println(+a.indexOf("creere"));
	
	System.out.println(a.charAt(7));
	
	for(int i=0;i<a.length();i++){
	if(a.charAt(i)=='x'){
	System.out.println(i);
	break;
	}
	}
	
	System.out.println(a.toUpperCase());
	if(a.charAt(0)=='E'){
	System.out.println("La primera letra es E");
	}else{
	System.out.println("La primera letra no es E");
	}
	

}
}