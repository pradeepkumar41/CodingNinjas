package BasicsOfImplementation;




public class CheckPalindrome {

	
	public static void main(String[] args) {
		
		
		System.out.println(checkPalindrome(""));
	}
	
	
	public static boolean checkPalindrome(String str){
		
		int flag=1;
		int l=str.length();
		int len=str.length()/2;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!=str.charAt(l-1-i))
			{
				flag=0;
				break;
				
			}
			
		}
		if(flag==1) 
			return true;
		else
			return false;
		
	
	
	}
				

	}

