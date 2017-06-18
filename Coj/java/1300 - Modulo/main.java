import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner n=new Scanner(System.in);
int a,b,c,d,f,g,h,j,k,l,o,i;
int r=0;
a=n.nextInt();
b=n.nextInt();
c=n.nextInt();
d=n.nextInt();
f=n.nextInt();
g=n.nextInt();
h=n.nextInt();
j=n.nextInt();
k=n.nextInt();
l=n.nextInt();
if(a%42==b%42||a%42==c%42||a%42==d%42||a%42==f%42||a%42==g%42||a%42==h%42||a%42==j%42||a%42==k%42||a%42==l%42){
	r++;
}
if(b%42==c%42||b%42==d%42||b%42==f%42||b%42==g%42||b%42==h%42||b%42==j%42||b%42==k%42||b%42==l%42){
	r++;
}
if(c%42==d%42||c%42==f%42||c%42==g%42||c%42==h%42||c%42==j%42||c%42==k%42||c%42==l%42){
	r++;
}
if(d%42==f%42||d%42==g%42||d%42==h%42||d%42==j%42||d%42==k%42||d%42==l%42){
	r++;
}
if(f%42==g%42||f%42==h%42||f%42==j%42||f%42==k%42||f%42==l%42){
	r++;
}
if(g%42==h%42||g%42==j%42||g%42==k%42||g%42==l%42){
	r++;
}
if(h%42==j%42||h%42==k%42||h%42==l%42){
	r++;
}
if(j%42==k%42||j%42==l%42){
	r++;
}
if(k%42==l%42){
	r++;
}
System.out.print(10-r);
}
}


























/*import java.util.Scanner;
Aqui esto esta yolo swag , jaja deberia salir lo mismo de arriba , pero me sale un 5 en algun lugar debe haber un error , pero el coj ya me 
acepto el de arriba asi que yolo
aqui que se quede
public class main{
public static void main(String[]args){
Scanner n=new Scanner(System.in);
int a,b,c,d,f,g,h,j,k,l,o,i;
int r=0;
a=n.nextInt();
b=n.nextInt();
c=n.nextInt();
d=n.nextInt();
f=n.nextInt();
g=n.nextInt();
h=n.nextInt();
j=n.nextInt();
k=n.nextInt();
l=n.nextInt();
if(a%42!=b%42&&a%42!=c%42&&a%42!=d%42&&a%42!=f%42&&a%42!=g%42&&a%42!=h%42&&a%42!=j%42&&a%42!=k%42&&a%42!=l%42){
	r++;
}
if(b%42!=c%42&&b%42!=d%42&&b%42!=f%42&&b%42!=g%42&&b%42!=h%42&&b%42!=j%42&&b%42!=k%42&&b%42!=l%42){
	r++;
}
if(c%42!=d%42&&c%42!=f%42&&c%42!=g%42&&c%42!=h%42&&c%42!=j%42&&c%42!=k%42&&c%42!=l%42){
	r++;
}
if(d%42!=f%42&&d%42!=g%42&&d%42!=h%42&&d%42!=j%42&&d%42!=k%42&&d%42!=l%42){
	r++;
}
if(f%42!=g%42&&f%42!=h%42&&f%42!=j%42&&f%42!=k%42&&f%42!=l%42){
	r++;
}
if(g%42!=h%42&&g%42!=j%42&&g%42!=k%42&&g%42!=l%42){
	r++;
}
if(h%42!=j%42&&h%42!=k%42&&h%42!=l%42){
	r++;
}
if(j%42!=k%42&&j%42!=l%42){
	r++;
}
if(k%42!=l%42){
	r++;
}
System.out.print(r);
}
}*/