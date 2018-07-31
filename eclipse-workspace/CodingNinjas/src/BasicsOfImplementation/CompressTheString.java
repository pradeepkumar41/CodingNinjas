package BasicsOfImplementation;
public class CompressTheString {
	
	public static void main(String[] args) {
		
		compressString("aabbccddeeffgghhiijjkk");		
	
	}
	
	static void compressString(String str ) {	
		String newstr="";
		int i=0;int count=0;
		for(i=0;i<str.length()-1;i++)
		{	
			if(str.charAt(i)==str.charAt(i+1)) 	
				count++;
			else
			{
				count++;
				if(count==1)
				{
					newstr+=str.charAt(i);
				}
				else
				{	
					newstr=newstr+count+str.charAt(i);
				}
				count=0;
			}
		}
	 count++;
	 if(count==1)
	  newstr+=str.charAt(i);
	 else
	 {
	  newstr=newstr+count+str.charAt(i);
	 }
		
	System.out.println(newstr);
		
	}
	

}
