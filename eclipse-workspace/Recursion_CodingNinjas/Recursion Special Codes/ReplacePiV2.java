
public class ReplacePiV2 {

	String replacePi(String input)
	{
		if(input.length()==1) {
			return input;
		}
		if(input.charAt(0)=='p' && input.charAt(1)=='i')
		{
			return 3.14+replacePi(input.substring(2));
		}
		else
		{
			
			return input.charAt(0)+replacePi(input.substring(1));
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}