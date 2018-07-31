package BasicsOfImplementation;

public class HighestOccourence {

	
	public static void main(String[] args) {
		
		
	 
		
	}
	
	
	

		public static void highestOccuringCharacter(String input) {
			
			int [] freq =new int[200];
			for(int i=0;i<input.length();i++) {
				
				++freq[ (int)input.charAt(i)];
				
			}
			
			int max=Integer.MIN_VALUE;
			int index=-1;		//index of the maximum occured character
			for(int j=96;j<=125;j++) {
				if(freq[j]>max)
				{
					max=freq[j];
					index=j;
					
				}
				
			}
				
			System.out.println((char)index);
			
			
			
	      
		
		
		
		}
	


}

	
	
	
	
	
	
	
	

