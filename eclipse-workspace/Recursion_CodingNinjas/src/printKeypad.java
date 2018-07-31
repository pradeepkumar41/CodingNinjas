
public class printKeypad {

	static void printKeypad(int num,String str) {
	
		if(num==0) {
			System.out.println(str);
			return ;
		}
		
		String test=mapping(num%10);
		
		for(int i=0;i<test.length();i++) {
			
			printKeypad(num/10,test.charAt(i)+str);
		}
		
	}
	


	static String mapping(int n)
	{
		String str[]= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		return str[n];
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		printKeypad(23,"");
		

	}

}
