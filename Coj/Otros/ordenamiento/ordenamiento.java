import java.util.Arrays;
public class ordenamiento{
public static void main(String[]args){
int[]secuencia={1,5,-1,3,26,3,45};
for(int i=0;i<secuencia.length;System.out.print(secuencia[i]),i++)
System.out.print(" ");
Arrays.sort(secuencia);
System.out.println(" ");

for(int i=0;i<secuencia.length;System.out.print(secuencia[i]),i++)
System.out.print(" ");
     
}
}