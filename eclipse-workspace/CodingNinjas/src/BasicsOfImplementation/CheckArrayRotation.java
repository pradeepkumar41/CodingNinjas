package BasicsOfImplementation;

public class CheckArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] arr= {4,5,6,1,2,3};
		System.out.println(checkRotation(arr));
	
	}

	static int checkRotation(int [] arr) {
		
		int min=Integer.MAX_VALUE; int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				index=i;
			}
			
		}
		return index;
		
		
		
		
	}
	

}
