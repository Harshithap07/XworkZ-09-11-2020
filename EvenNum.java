class EvenNum{
	public static int[] even(int a[]){
	int evenNum[]=new int[a.length];
	int j=0;
	for(int i=0;i<10;i++){
	if(a[i]%2==0){
	evenNum[j]=a[i];
	j++;
	}
	}
	return evenNum;
	}
	public static void main(String args[]){
	int a[]={4,6,7,8,16,57,66,78,93,98};
	int b[]=even(a);
	for(int i=0;i<b.length;i++){
	if(b[i]==0)
	break;
	System.out.println("num is"+b[i]);
}	
}
}	 