package BasicsOfImplementation;
public class ReverseAWord {
	public static void main(String[] args) {
			
		reverseEachWord("what is your possion ");
	}
	
public static void reverseEachWord(String input) {
	
	
	int count=0,j=0;
	String mainstr="";
	String strword="";
	String rev="";
	for(int i=0;i<input.length();i++) {
		
		if(input.charAt(i)==' ' || i==input.length()-1) {
				
				if( i==input.length()-1 )
				{		count++;
					strword=input.substring(i-count+1, i+1);
			
				}
				else
					strword=input.substring(i-count, i);
					
			j=0;rev="";
			while(j<strword.length()) {
				
				
				rev=strword.charAt(j)+rev;
				j++;
				
			}
			mainstr=mainstr+rev+" ";
			count=0;
			
		}
		else
			count++;
		
		
	}
	
	System.out.println(mainstr);
	
	

	
	
	
}



}
