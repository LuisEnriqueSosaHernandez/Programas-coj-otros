public class problema3{
public static void main(String[]args){
String s="Manana es Sabado sabadete y voy a irme a tomar unas copillas por los barrios bajos de logrono";
int x=0,c=0,v=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a'){
x++;
}
if(s.charAt(i)=='o'){
c++;
}
if(s.charAt(i)=='e'){
v++;
}

}
System.out.println("El numero de veces que aparece a es: "+x);
System.out.println("El numero de veces que aparece o es: "+c);
System.out.println("El numero de veces que aparece e es: "+v);
if(x>10){
System.out.println("El numero de veces que aparece a es excedido ");
}
if(c>5){
System.out.println("El numero de veces que aparece o es excedido ");
}
if(v>3){
System.out.println("El numero de veces que aparece e es excedido ");
}

}
}