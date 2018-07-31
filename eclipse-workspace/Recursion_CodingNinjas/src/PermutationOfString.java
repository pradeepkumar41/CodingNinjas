
public class PermutationOfString {

	//finding all the permutation and combination of a substring
	
 static  String [] permutation(String input)
	{
		if(input.length()==0)
		{
			String arr[]= {""};
			return arr;
			
		}
		String [] smallAns=permutation(input.substring(1));		//Assumption that we know permutation for bc
		
		String [] finalAns=new String[smallAns.length*3];
		
//		for(int i=0;i<smallAns.length;i++)
//		{
//			finalAns[i]=smallAns[i];
//			
//		}

		int j=0;
		for(int i=0;i<3*smallAns.length;i++)
		{
			//finalAns[i]=input.charAt(0)+smallAns[j];		
			
				String str=smallAns[j];
				for(int m=0;m<str.length();m++)
				{
					finalAns[i]=str.substring(0, m)+input.charAt(0)+str.substring(m,str.length());
					i++;
				}
				j++;
				
			
			
			
	}
		return finalAns;	
	}
	
	public static void main(String[] args) {
		
		String [] ans=permutation("abc");
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
		
		
	}
	
	
}
