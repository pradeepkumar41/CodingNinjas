
public class LastIndex {
	public static void main(String []args) {
		int []input= {8,8,8,8,12,3,4,5,68,8};
		System.out.println(lastIndex(input,8,0,-1));
	}
	
	public static int lastIndex(int input[],int x,int startIndex,int foundIndex) {
		
		
		if(startIndex==input.length-1) {
			if(x==input[startIndex])
			return startIndex;
			else
				return foundIndex;
		}
		
		if(input[startIndex]==x) {
			foundIndex=startIndex;
		}
		return lastIndex(input,x,startIndex+1,foundIndex);
	}
}