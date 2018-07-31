package BasicsOfImplementation;

public class PrintSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 printSubstrings("xyz");
		
	}

	public static void printSubstrings(String str){

	String temp="";
	
		for(int i=0;i<str.length();i++) {
			
			for(int j=i;j<str.length();j++ )
			{
				System.out.println(str.substring(i, j+1));
				
				
				
			}
			
			
			
			
		}
		
		
		
		
		

	}
	

}



