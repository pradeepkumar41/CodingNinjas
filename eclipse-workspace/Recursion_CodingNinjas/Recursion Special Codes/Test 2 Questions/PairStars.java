public class PairStars
{
	// Return the updated string
	public static String addStars(String input)
	{
      String current=""+input.charAt(0);
      return addStars1(input,current,1);
    }
  
  	public static String addStars1(String input,String current,int index)
    {
		if(index==input.length())
        {
          return current;
        }
		
		if(input.charAt(index-1)==input.charAt(index))
        {
          current=current+"*"+input.charAt(index);
          return addStars1(input, current, index+1);
        }
      	
		else
        {
          current=current+""+input.charAt(index);
          return addStars1(input, current, index+1);
        }
    }
  	
  	public static void main(String[] args) {
		
  		System.out.println(addStars("aaaa"));
  		
	}
  	
  	
  	
}
