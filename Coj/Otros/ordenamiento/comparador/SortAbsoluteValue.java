import java.util.Arrays;
import java.util.Comparator;
class SortAbsoluteValue implements Comparator{

public int compare(Object a,Object b){

Integer x=(Integer)a;
Integer y=(Integer)b;

//return x.intValue()-y.intValue();

if(x==y)return 0;
else
if(Math.abs(x.intValue())>Math.abs(y.intValue()))return 1;
else return -1;

}

}