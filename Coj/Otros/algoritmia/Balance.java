import java.io.PrintWriter;
public class Balance{
public static void main(String[]args){
	long inicio,fin,tiempo;
	PrintWriter salida=new PrintWriter(System.out);
	inicio=System.currentTimeMillis();
	int n=40000,i=1;
double deposito,interes,balance;
deposito=50.000;
interes=0.005;
balance=100.00;
while(i<=n){
balance=balance+deposito+(balance*interes);
i++;
salida.println(balance);
}
salida.println(balance);
fin=System.currentTimeMillis();

tiempo=fin-inicio;


salida.println(tiempo);
salida.close();

}


}
//10-0.....100-0...1000-0...10000-0...100000-0....1000000-16-infinity
//10000-766...20000-1610...30000-2432...40000-3234