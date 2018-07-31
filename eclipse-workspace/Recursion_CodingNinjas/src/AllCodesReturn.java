
public class AllCodesReturn {

	static	char mapping(String str) {
		if(str.length()==1)
		{
			int k=str.charAt(0)-'0';
			return (char)(k+96);
		}
		else {
			int k=(str.charAt(0)-'0')*10+(str.charAt(1)-'0');
			return (char)(96+k);
		}
	}
	
	
	static String [] allCodes(String str) {
		
		if(str.length()==0)
		{	String[] result= {""};
			return result;
		}
	
		char map1=mapping(str.substring(0,1));
		String [] smallAns=allCodes(str.substring(1));
		
		for(int i=0;i<smallAns.length;i++) {
			smallAns[i]=map1+smallAns[i];
		}
		
		
		String [] smallAns1= new String[0]; char map2=' ';;
		if(str.length()>=2) {
		   map2=mapping(str.substring(0,2));
		   if(map2<='z')
		   smallAns1=allCodes(str.substring(2));
		}
		
		for(int i=0;i<smallAns1.length;i++) {
			smallAns1[i]=map2+smallAns1[i];
		}
	
		String [] result=new String[smallAns.length+smallAns1.length];
		
		for(int i=0;i<smallAns.length;i++) {
			result[i]=smallAns[i];
		}
		
		for(int i=0;i<smallAns1.length;i++) {
			result[i+smallAns.length]=smallAns1[i];
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		
		
		String [] ans=allCodes("35411");
		
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
		
	}
	
	
	
	
	
	
	
	
	
	
}
