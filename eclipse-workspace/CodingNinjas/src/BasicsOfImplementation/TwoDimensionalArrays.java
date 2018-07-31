package BasicsOfImplementation;
import java.util.Scanner;
public class TwoDimensionalArrays {
	
	static void display2d(int arr[][])
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();		
		}	
	}
	
	static void createArray() {
		Scanner s=new Scanner(System.in);		
		int rows=0;
		System.out.println("Enter the number of rows");
		rows=s.nextInt();
		int [][] arr=new int[rows][];
		
		for(int i=0;i<rows;i++) 
		{
			System.out.println("Enter the number of columns in row "+i);
			int cols=s.nextInt();
		    arr[i]=new int[cols];	    
			for(int j=0;j<cols;j++)
			{
				System.out.println("enter the element "+i+" "+j);
				arr[i][j]=s.nextInt();	
			}
		
		}
		display2d(arr);
	}
	public static void main(String[] args) {
		createArray();			
	}
	
	
}
