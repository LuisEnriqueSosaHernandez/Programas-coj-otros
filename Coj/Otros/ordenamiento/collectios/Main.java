import java.util.ArrayList;
import java.util.Collections;
public class Main{
public static void main(String[]args){
ArrayList<Integer> secuencia=new ArrayList<Integer>();
secuencia.add(new Integer(10));
secuencia.add(new Integer(-10));
secuencia.add(new Integer(50));
secuencia.add(new Integer(-3));
System.out.println(secuencia);
Collections.sort(secuencia);
System.out.println(secuencia);
}

}