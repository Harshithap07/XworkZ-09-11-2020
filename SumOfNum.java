  
class SumOfNum{
	public static int sum(int x[]){
	int s=0;
	for(int i=0;i<10;i++){
	s=s+x[i];
	}
	return s;
	}
	public static void main(String args[]){
	int x[]={2,7,89,6,56,45,43,24,68,89};
	System.out.println("sum is"+sum(x));
}	
}	