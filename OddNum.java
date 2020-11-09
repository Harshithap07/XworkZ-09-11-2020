class OddNum{
	public static int[] odd(int x[]){
	int oddNum[]=new int[x.length];
	int j=0;
	for(int i=0;i<10;i++){
	if(x[i]%2==1){
	oddNum[j]=x[i];
	j++;
	}
	}
	return oddNum;
	}
	public static void main(String args[]){
	int x[]={2,3,4,5,8,9,16,19,66,87,93,97};
	int y[]=odd(x);
	for(int i=0;i<y.length;i++){
	if(y[i]==0)
	break;
	System.out.println("num is"+y[i]);
}	
}
}	 