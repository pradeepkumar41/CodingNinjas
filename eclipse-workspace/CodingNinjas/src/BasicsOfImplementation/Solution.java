package BasicsOfImplementation;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		  Scanner s=new Scanner(System.in);
		int s1=0,s2=0;
		s1=s.nextInt();
		
		int [] input1=new int[s1];
		
		for(int i=0;i<input1.length;i++) {
			input1[i]=s.nextInt();
		}
		
		s2=s.nextInt();
		int [] input2=new int[s2];
		
		for(int i=0;i<input2.length;i++) {
			input2[i]=s.nextInt();
		}	
		long maxsum=maximumSumPath(input1, input2);
		System.out.println(maxsum);
		
	}
	
	 public static long maximumSumPath(int[] input1, int[] input2) {
		 
		 int p=0,q=0,index=0;  
		 long rem1=0,rem2=0;
		 int flag=0;
		 int []array=null;
		 long s1=0,s2=0,maxsum=0,remSum=0;
		 while(true) {
		
			 if(p<input1.length && q<input2.length) {
				 
				 if(input1[p]>input2[q]) {
				
					 s2+=input2[q];
					 q++;
					 
				 }
				 else if(input1[p]<input2[q]) {
					 s1+=input1[p];
					 p++;
					 
				 }
				 
				 else {
					 
					 
					 s1+=input1[p];p++;
					 s2+=input2[q];q++;
					 if(s1>s2)
						 maxsum+=s1;
					 else
						 maxsum+=s2;
					 
					 s1=0;s2=0;
					 
					 
				 }
				 
			 } //end of if()
			 
			 else {
				 
				 rem1=s1;
				 rem2=s2;
				 
				 if(p==input1.length) {
					 array=input2;
					 index=q;
					 flag=1;
					 
					 
				 }
				 else if(q==input2.length)
				 {
					 array=input1;
					 index=p;
					 flag=2;
					 
				 }
				 
				 else {
					 	remSum=0;
					 	flag=3;
					 
				 }
				//calculating the final answer
				 
				 for(int i=index;i<array.length;i++) {	 
					 remSum+=array[i];
				 }
				 
				 if(flag==1) {
					 rem1=s1;
					 rem2=s2+remSum;
				 }
				 else {
					 rem1=s1+remSum;
					 rem2=s2;				 
				  }
				 
				 maxsum+=remSum;
				 
				 return maxsum;
				 
			 }
			 
		 }
		 
	 }
	
}



