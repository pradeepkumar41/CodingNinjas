package BasicsOfImplementation;
public class RemoveTheDuplicates {
	
	public static void main(String[] args) {

		
		
		removeDuplicates("a");
		
		
	}
	
	static void removeDuplicates(String str ) {	
		String newstr="";
		int i=0;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1)) 	
				newstr+=str.charAt(i);
				
			
			
		}
		
	 newstr+=str.charAt(i);
		
	System.out.println(newstr);
		
	}
	
	
	
	
	

}
