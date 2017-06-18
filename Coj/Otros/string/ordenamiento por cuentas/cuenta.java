public class cuenta{
	public int[] contSort(int []a,int k){
	int []c=new int[k];
	for(int i=0;i<a.length;i++){
		c[a[i]]++;
	}
	for(int i=1;i<k;i++){
		c[i]+=c[i-1];
	}
	int b[]=new int[a.length];
	for(int i=a.length-1;i>=0;i--){
		b[--c[a[i]]]=a[i];
		
	}
	return b;
}
public static void main(String[]args){
	cuenta cuentita=new cuenta();
int [] arreglo={7,2,9,0,1,2,0,9,7,4,4,6,9,1,0,9,3,2,5,9};
int x=10;
arreglo=cuentita.contSort(arreglo,x);
for(int i=0;i<arreglo.length;i++){
	System.out.print(arreglo[i]+" ");
}

}
}



