
public class ReplaceAllCharacter {

	static String replaceCharacter(String input,char c1,char c2)
	{
		if(input.length()==0)
		{
			return "";
		}
		
		String str=replaceCharacter(input.substring(1), c1, c2);
		if(input.charAt(0)==c1)
			return c2+str;
	
		return input.substring(0, 1)+str;	  
	
	}
	public static void main(String[] args) {
		
		System.out.println(replaceCharacter("aabbbbbbbcccccddddd", 'b', 'z'));
	}
	
	
	
}

