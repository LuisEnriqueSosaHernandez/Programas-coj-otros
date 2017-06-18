import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
public class main{
public static void main(String[]args){
/*Palmera [] tiposPalmeras=new Palmera[3];
tiposPalmeras[0]=new Palmera(20,15.6f);
tiposPalmeras[1]=new Palmera(30,10.7f);
tiposPalmeras[2]=new Palmera(10,18.9f);*/

Vector<Palmera>tiposPalmeras=new Vector<Palmera>();
tiposPalmeras.add(new Palmera(20,15.6f));
tiposPalmeras.add(new Palmera(30,10.7f));
tiposPalmeras.add(new Palmera(10,18.9f));


//Arrays.sort(tiposPalmeras,new OrdenamientoNumeroCocos());
Collections.sort(tiposPalmeras,new OrdenamientoNumeroCocos());
for(Palmera p: tiposPalmeras){
System.out.print(p.getNumeroCocos()+" "+p.getAltura());
System.out.println();
}
}

}