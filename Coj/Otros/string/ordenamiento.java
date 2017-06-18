import java.util.Arrays;
public class ordenamiento{
public static void main(String[]args){
String a="ababxczs";
String x="";
char[]ab=a.toCharArray();
Arrays.sort(ab);

System.out.println(ab);
System.out.println("");
for(int i=a.length()-1;i>0;i--){
System.out.print(ab[i]);
}


}

}