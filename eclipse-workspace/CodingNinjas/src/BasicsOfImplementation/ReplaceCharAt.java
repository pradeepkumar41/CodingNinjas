package BasicsOfImplementation;

public class ReplaceCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		replaceCharacter("eeedeep", 'e', 'x');
				
		
				
		
		
		
	}

	public static String replaceCharacter(String input, char c1, char c2) {
      
		String str="";
		
      for(int i=0;i<input.length();i++){
        
        if(input.charAt(i)==c1)
        	input=input.substring(0, i)+c2+input.substring(i+1);
        
      }
//      input=str;
      System.out.println(input);
      return input;
      
	}
}

	
	

