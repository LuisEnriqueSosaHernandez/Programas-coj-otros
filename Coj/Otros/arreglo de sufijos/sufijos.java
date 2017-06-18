public class sufijos{

static void metodo(String o,int []p){
for(int i=0;i<p.length;i++){
System.out.println(o.substring(p[i]));

}

}
public static void main(String[]args){
String a="banana";
int []p={5,3,1,0,4,2};
metodo(a,p);
}
}
