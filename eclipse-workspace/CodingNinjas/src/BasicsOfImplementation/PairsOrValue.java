package BasicsOfImplementation;

public class PairsOrValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



static void pairCounter(long [] arr,long k) {
	
	int count=0;
	
	for(int i=0;i<arr.length-1;i++) {		
		for(int j=i+1;j<arr.length;j++) {
			
			long value=i|j;
			if(value>k)
				count++;			
		}
	}
	System.out.println(count);
	
}

}