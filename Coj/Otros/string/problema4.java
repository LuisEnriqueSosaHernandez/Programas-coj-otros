import java.util.Scanner;
public class problema4{
public int mayusculas(String a){
int x=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)<96){
x++;
}
}
return x;
}
public int minusculas(String a){
int x=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)>96){
x++;
}
}
return x;
}

public static void main(String[]args){
problema4 problemita=new problema4();
Scanner l=new Scanner(System.in);
String a=l.nextLine();

problemita.minusculas(a);
System.out.println("El numero de minusculas es: "+problemita.minusculas(a));
System.out.println("El numero de minusculas es: "+problemita.mayusculas(a));


}
}