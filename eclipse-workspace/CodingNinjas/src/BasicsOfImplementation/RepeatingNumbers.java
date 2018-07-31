package BasicsOfImplementation;

public class RepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}

static void print(int n) {
	int r=1,count=0,k=1,p,j,loop;
	
	while(r<=n) {
		
		p=k;
		j=1;
		loop=count+1;
		while(j<=loop) {
			if(p>9)
				p=1;
			System.out.print(p++);
			k=p;
			j++; count++;
			
			
		}
		
		
		System.out.println();
		
		
	r++;
	}
	
	
	
	
	
}




	
	
}

