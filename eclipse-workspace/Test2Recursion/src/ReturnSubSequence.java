
public class ReturnSubSequence {

	
	static String[] returnSubsequence(String input)
	{
		
		if(input.length()==0)
		{
			
			String str[]= {""};
			return str;
			
		}
		else
		{	
			String [] smallAns=returnSubsequence(input.substring(1));
			
			String [] result=new String[smallAns.length*2];
			
			//loop to copy the original of smallAns into the result
			for(int i=0;i<smallAns.length;i++)
			{
				result[i]=smallAns[i];
				
			}	
			//loop to append the zeroth character of input string at the starting of the string
			for(int i=0;i<smallAns.length;i++)
			{
				result[i+smallAns.length]=input.charAt(0)+smallAns[i];
			}

			return result;
			
		}		
	}

	public static void main(String[] args) {

		String [] ans=returnSubsequence("prad");
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);


	}
	
	
	
	
	
}
