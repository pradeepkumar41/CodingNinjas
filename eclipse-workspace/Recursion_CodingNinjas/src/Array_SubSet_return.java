
public class Array_SubSet_return {

	public static int[][] subsets(int a[]) {
		return subarray(a,0);
	}
	
	static int[][] subarray(int []a ,int i){
		if(i==a.length) {
			int [][] ans= {{}};
			return ans;
		}
		
		int [][] smallans=subarray(a,i+1);
		int [][] result=new int[smallans.length*2][];
		
		int resultLength=smallans.length*2;
		
		for(int k=0;k<resultLength/2;k++) {
			result[k]=new int[smallans[k].length+1];
			result[k][0]=a[i];
			
			for(int j=1;j<smallans[k].length;j++) {
				result[k][j]=smallans[k][j-1];
			}
			
		}
		for(int k=(int)resultLength/2;k<result.length;k++) {
			result[k]=new int[smallans[k-resultLength/2].length];
			for(int j=0;j<smallans[k-resultLength/2].length;j++) {
				result[k][j]=smallans[k-resultLength/2][j];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
}
