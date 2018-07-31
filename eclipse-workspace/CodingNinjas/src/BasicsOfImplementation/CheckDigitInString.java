package BasicsOfImplementation;

public class CheckDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDigit("123pradeepchaduahry3939");
	}
	
	static void checkDigit(String str) {
		int digit=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			 digit++;
			
		}
		System.out.println(digit);
		
		
		
		
		
		
		
	}
	
	
	

}
