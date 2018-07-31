
public class PrintPermutation {

	
	static void printPermutation(String input,String output) {
		
		if(input.length()==0) {			//printPermutation of a String			
			System.out.println(output);	
			return;
		}
		
		for(int i=0;i<input.length();i++) {
			
			printPermutation(input.substring(0, i)+input.substring(i+1, input.length()), output+input.charAt(i));
			
		}
	}
	
	public static void main(String[] args) {
		
		
		printPermutation("pradeep", "");
		
		
		
		
		
		
		
		
	}

}
