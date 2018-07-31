package BasicsOfImplementation;

public class GreatestCommonDivisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gcd(10, 5);
		
	}


static long factorial(long fact ) {
	
	if(fact==1)
		return 1;
	else
		return fact*factorial(fact-1);

}

static void gcd(int num1,int num2) {
	
	int fact;
	if(num1>num2)
		fact=num2;
	else
		fact=num1;
	
	System.out.println(factorial(fact));
	
	
}	
	
}