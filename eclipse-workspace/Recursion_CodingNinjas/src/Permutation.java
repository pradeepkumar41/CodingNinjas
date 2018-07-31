
public class Permutation {

	static String[] permutation(String str)
	{
		if(str.length()==0){			//base case when length became zero return empty string
			String [] str1= {""};
			return str1;
		}
		
		String [] str2=permutation(str.substring(1));		//calling with string except first character
		
		String [] str3=new String[str2.length*str.length()];	//creating new string to store the permutation	
		
		int k=0;
		for(int i=0;i<str2.length;i++) {	
			for(int j=0;j<str.length();j++) {					//creating and puting all the permutations inside str3;
				str3[k++]=str2[i].substring(0, j)+str.charAt(0)+str2[i].substring(j);
			}			
		}
		return str3;
	}
	
	public static void main(String[] args) {	
		String [] ans=permutation("ab");
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);	
		}	
	}
	
}
