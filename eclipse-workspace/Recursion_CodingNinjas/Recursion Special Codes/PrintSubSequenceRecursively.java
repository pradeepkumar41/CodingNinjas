
public class PrintSubSequenceRecursively {
	
	static void printSubsequence(String input,String resultSoFar) {

		if(input.length()==0) {				//base condition when length of input became zero
			System.out.println(resultSoFar);
			return;
		}
		printSubsequence(input.substring(1), resultSoFar);		//not adding the first character to the result
		printSubsequence(input.substring(1), resultSoFar+input.charAt(0));	//adding the first character to the result
		
	}
	public static void main(String[] args) {
		
		printSubsequence("236","");
		
	}
	
	
	
	
	
	
}
