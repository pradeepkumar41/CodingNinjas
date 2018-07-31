package BasicsOfImplementation;

public class ReplaceAllZerosWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		replace(50504);
	}



static void replace(int n) {
	
	int l=0,d;int num=n;int rev;
	for(int i=1;i<=2;i++) {
		l=0;
		while(num!=0) {
			
			d=num%10;
			if(d==0) 
				d=5;
			l=10*l+d;
			num/=10;
		
		}
		num=l;
		
	}
	
	System.out.println(l);
	





}	



}