public class problema2{
public static void main(String[]args){
String a="Manana es Sabado sabadete y voy a irme a tomar unas copillas por los barrios bajos de logrono";
int x=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)=='a'){
x++;
}
}
System.out.println("El numero de veces que se repite a es: "+x);
}

}