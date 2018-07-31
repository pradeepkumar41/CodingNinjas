
//program returning String Containing all the subsequences


public class printSubsequence {

	static String[] subsequence(String input)
	{
		if(input.length()==0)
		{	String arr[]= {""};
			return arr;
		}
		
		String [] smallAnswer=subsequence( input.substring (1));
		
		String [] ans=new String[smallAnswer.length*2];
		
		//loop to copy first time as such
		for(int i=0;i<smallAnswer.length;i++)
		{
			ans[i]=smallAnswer[i];	
		}
		int j=0;
		//loop to copy appending the first character
		for(int i=0;i<smallAnswer.length;i++)
		{
			ans[i+smallAnswer.length]=input.charAt(0)+smallAnswer[i];	
		}
		return ans;	
	}
	public static void main(String[] args) {
		
		String [] result=subsequence("236");
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
		
		
		
	}
	
	
	
	
}