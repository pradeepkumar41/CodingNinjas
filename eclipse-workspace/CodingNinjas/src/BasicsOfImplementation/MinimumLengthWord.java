package BasicsOfImplementation;

public class MinimumLengthWord {

public static void main(String[] args) {
	
	
	minimumLength("winter isthee c");
	
}
	
	
	
	
static void minimumLength(String input) {
	
	int count=0; int i=0;
	int index=0;
	int min=Integer.MAX_VALUE;
	for( i=0;i<input.length();i++) {
		if(input.charAt(i)==' ' || i==input.length()-1)
		{
			if(i==input.length()-1)
			{	count++ ;i++;}
			if(min>count)
			{	min=count;
			   index=i-count;
			}
			count=0;
			
		}
		
		
		else
		{
			count++;
		}		
	}
	String minstr=input.substring(index, index+min);
	System.out.println(minstr);
	
}
}
