package BasicsOfImplementation;

public class MaximumOccurenceOfcharacter {

	public static void main(String[] args) {
		
		maximumOccurence("");
		
		

	}



static void maximumOccurence(String str)
{
	
	int maxfreq=0;
	int freq=0;
	char chmax='a';
	char ch=str.charAt(0);
	for(int i=0;i<str.length()-1;i++)
	{
		ch=str.charAt(i);
		for(int j=i+1;j<str.length();j++)
		{
			
			if(ch==str.charAt(j))
				freq++;
			
		}
		
		if(freq>maxfreq) {
			maxfreq=freq;
			chmax=ch;
		}
		freq=0;
		
	}
	
	System.out.println(chmax);
	
	
	
	
	
	
	
	
	
	
	
	
}





}
