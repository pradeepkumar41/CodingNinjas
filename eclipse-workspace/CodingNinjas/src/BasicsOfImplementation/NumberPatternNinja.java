package BasicsOfImplementation;


public class NumberPatternNinja {


	public static void formArray(int n)
	{
		int i=1;
		int [] arr=new int[n+1];
		
		int count=1; 
		while(i<=n/2) {
			
			arr[i]=count;
			arr[n+1-i]=count+n;
			count=arr[n+1-i]+n;
			i++;	
		}
		
		if(n%2!=0){
			arr[i]=count;
		}
		
//		for(int k=1;k<=n;k++) {
//			System.out.print(arr[k]+" ");
//		}
		
	//value array is created
		
		int loop=1,p,j;
		while(loop<=n) {
			
			p=arr[loop];
			j=1;
			while(j<=n) {
				System.out.print(p++ +" ");
				j++;
			}
			
			loop++;
			System.out.println();
			
			
			
		}
		
	
		
		
		
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		formArray(10);
		
	}

}
