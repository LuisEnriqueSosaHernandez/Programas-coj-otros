import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);


while(l.hasNext()){
	String b=l.next();
if(b.equals("X")){
	break;
}
String s=l.next();
int cont=0;
for(int i=0;i<b.length();i++){
if(b.charAt(i)==s.charAt(i)){
cont++;
}

}
System.out.println("Hamming distance is "+(b.length()-cont)+".");

}

}
}