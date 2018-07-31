
public class PermutationOfStringsV2 {

	
	static String[] permutation(String str)
	{
		if(str.length()==0){
			String [] str1= {""};
			return str1;
		}
		
		String [] str2=permutation(str.substring(1));
		
		String [] str3=new String[str2.length*str.length()];
		
		int k=0;
		for(int i=0;i<str2.length;i++) {
			
			for(int j=0;j<str.length();j++) {
				
				str3[k++]=str2[i].substring(0, j)+str.charAt(0)+str2[i].substring(j);
			}			
		}
		return str3;

	}
	
}
