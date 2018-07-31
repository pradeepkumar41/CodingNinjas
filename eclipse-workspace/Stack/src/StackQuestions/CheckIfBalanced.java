package StackQuestions;
import java.util.Stack;

public class CheckIfBalanced {

	public static boolean checkBalanced(String exp) {
		// Write your code here
		//   { a + [ b+ (c + d)] + (e + f) }
		Stack<Character> S=new Stack<>();	//creating stack
		for(int i=0;i<exp.length();i++)
		{
			//scan the entire string
			char ch=exp.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(') 
			{
				S.push(ch);	//pushing the bracket	
			}
			else if(ch=='}' || ch==']' || ch==')')
			{
				//time to pop the open bracket and need to check its validity
				char check=S.pop();	

				if(ch==')')
				{
					if(check!='(')
					{
						return false;
					}		
				}
				else if(ch==']')
				{
					if(check!='[')
					{
						return false;
					}	
				}
				else if(ch=='}')
				{
					if(check!='{')
					{
						return false;
					}			
				}
			}	
		}
		if(S.isEmpty())
			return true;
		else
			return false;		
	}




	public static void main(String[] args) {

		String exp="{ a + [ b - c } ]";
		System.out.println(checkBalanced(exp));

	}





}
