package BasicsOfImplementation;

import java.util.Scanner;

public class ReaarangingTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	
	int [] input=new int[n];
	for(int i=0;i<input.length;i++)
	{
		input[i]=s.nextInt();
	}
		
		
	int p=find(input);
		
	System.out.println(p);
	}
	
	
	static int find(int [] input) {
		
		
		int [] freq=new int[1000001];
		
		for(int i=0;i<input.length;i++) {
			
			++freq[input[i]];
			
		}
		
		for(int k=0;k<freq.length;k++)
		{
			
			if(freq[k]==1)
				return k;
			
		}
		
		return -1;

	}
	
	
	
	
	
	

}
