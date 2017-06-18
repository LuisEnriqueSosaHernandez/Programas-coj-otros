import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<Double>Promedio=new ArrayList<Double>();
ArrayList<String>Concursantes=new ArrayList<String>();
DecimalFormat redondeo = new DecimalFormat("0");
double Prom=0;
String S=l.next();
int N=l.nextInt();
for(int i=0;i<N;i++){
String Q=l.next();
double Ra=l.nextDouble();
Promedio.add(Ra);
double W=l.nextDouble();
double We=l.nextDouble();
double K=l.nextInt();

double R = Ra + K * (W - We);
Concursantes.add(Q+" "+redondeo.format(R));
}
System.out.println("Tournament: "+S);
System.out.println("Number of players: "+N);
System.out.println("New ratings:");
for(int i=0;i<Concursantes.size();i++){
System.out.println(Concursantes.get(i));
}
for(int i=0;i<Promedio.size();i++){
Prom+=Promedio.get(i);
}
Prom/=N;
System.out.println("Media Elo: "+redondeo.format(Prom));

}
}