package BasicsOfImplementation;

public class lastIndexSirCode {

	static int lastIndexOf7(int [] arr,int index) {
		
		if(arr.length==index) {
			return -1;
		}
		int smallAns=lastIndexOf7(arr, index+1);
		if(smallAns==-1) {
			if(arr[index]==7) {
				return index;	
			}
		}
		return smallAns;
		
	}
	


public static void main(String[] args) {
	
	
	int [] arr= {1,2,5,2};
	System.out.println(lastIndexOf7(arr, 0));
	
	
	
}

}
