package BasicsOfImplementation;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




	public static int countWords(String str){
	
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				
				count++;			
			}
			
		}
		if(count==0)
			return count;
		else
		return count+1;
		
		
		
		
		
	}
	






}
