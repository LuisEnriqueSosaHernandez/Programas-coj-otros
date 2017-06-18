import java.util.Comparator;
public class OrdenamientoNumeroCocos implements Comparator<Palmera>{
public int compare(Palmera a,Palmera b){
if(a.getNumeroCocos()==b.getNumeroCocos())
return 0;
else
if(a.getNumeroCocos()>b.getNumeroCocos())
return 1;
else
return -1;

}

}