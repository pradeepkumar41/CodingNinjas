public class ReplacePi {

	// Return the changed string
	public static String replace(String input){
		
      String current="";
      
      return replace1(input,0,current);
      
      
	}
  
  static String replace1(String input,int index, String current)
  {
    
    if(index==input.length())
    {
      return current;
    }
    
    if(input.charAt(index)=='p' && index!=input.length()-1)
    {
      
      if(input.charAt(index+1)=='i')
      {
        current=current+"3.14";
        return replace1(input,index+2,current);
        
      }
      else
      {
        
        current=current+input.charAt(index);
       return replace1(input,index+1,current);  
      }
      
    }
    else
    {
        
        current=current+input.charAt(index);
       return  replace1(input,index+1,current);
        
    }
    
  }
  
  public static void main(String[] args) {
	
	  
	  System.out.println(replace("pradepipipradeep"));
	  
	  
}
  
  
}
