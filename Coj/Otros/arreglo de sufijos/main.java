import java.util.*;
public class main{
	public static void main(String[]args){
String []a={"pepe","juan","maria","alberto"};
Comparator<String>compara=new Comparator<String>(){
public int compare(String a,String b){
int resultado=a.compareTo(b);
return resultado;

}

};
Arrays.sort(a,compara);
System.out.println(Arrays.toString(a));


	}

}