

/*
import java.util.*;
public class Solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here


		int profit=Integer.MIN_VALUE;

		Arrays.sort(budget);	//budget is now sorted

		int length=budget.length;

		//int currentChoice;

		for(int i=0;i<budget.length;i++)
		{

			int temp=budget[i]*(length-i);

			if(temp>profit)
				profit=temp;
		}
		return profit;	
	}
}
 */
//___________________________________________________________

/*

public class Solution {

	public static String minLengthWord(String input){
		int minlength=Integer.MAX_VALUE;
		int start=0,end=0,length=0,tempstart=0,tempend=0;

		for(int i=0;i<input.length();i++)
		{
			if(i==input.length()-1)	//last character
			{
				length++;
				if(length<minlength)
				{
					start=tempstart;
					minlength=length;
					end=i-1;


					String str=input.substring(start, input.length());
					return str;


				}		//current length of the word	



			}

			if(input.charAt(i)==' ')
			{
				if(length<minlength)
				{
					start=tempstart;

					minlength=length;

					end=i-1;

				}		//current length of the word		

				tempstart=i+1;
				length=0;
			}
			else
			{
				length++;
			}
		}

	String str=input.substring(start, end+1);
	return str;
	}


	public static void main(String[] args) {


		String str="what is the p";

		//System.out.println(str.substring(0,0));

		System.out.println(minLengthWord(str));

	}


}








 */

public class Solution {

	//finding all the permutation and combination of a substring

	static  String [] StringLengthK(String input,int k)
	{
		if(input.length()==0)
		{
			String arr[]= {""};
			return arr;

		}



		String [] smallAns=StringLengthK(input.substring(1),k);

		String [] finalAns=new String[smallAns.length*input.length()];



		int j=0;
		while(j<finalAns.length)
		{

			for(int i=0;i<smallAns.length;i++)
			{
				finalAns[i]=smallAns[i]+input.charAt(j);

			}
			
		 j++;
		}	

		return finalAns;
		
		}

		public static void main(String[] args) {

			String [] ans=StringLengthK("abc", 2);
			for(int i=0;i<ans.length;i++)
				System.out.println(ans[i]);


		}


	}


































