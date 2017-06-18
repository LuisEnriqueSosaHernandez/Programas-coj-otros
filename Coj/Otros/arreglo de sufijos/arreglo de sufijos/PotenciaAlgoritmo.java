class PotenciaAlgoritmo{
private Sufijo[]suffixArray;
private int[]suffixIndex;
public int[]buildSuffixArray(String a){
int n=a.length();
suffixArray=new Sufijo[n];
suffixIndex=new int[n];
for(int i=0;i<n;i++){
Sufijo temp=new Sufijo();
temp.SetIndice(i);
temp.SetRank0(a.charAt(i));
temp.SetRank1(i<n-1?a.charAt(i+1):-1);
suffixArray[i]=temp;
}
System.out.print(a);
return suffixIndex;
}

}