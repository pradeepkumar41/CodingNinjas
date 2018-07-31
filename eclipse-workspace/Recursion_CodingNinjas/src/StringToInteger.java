public class StringToInteger {
public static int convertStringToInt(String input){

	int num=0;	
	return convertStringToInt1(input,0,num);
	
	}
  
  static int convertStringToInt1(String input,int index,int num)
  {
    if(input.length()==index)
    {
      return num;
    }
    num=num+((int)input.charAt(index)-(int)'0')*(int)Math.round(Math.pow(10,input.length()-1-index));
    
    return convertStringToInt1(input,index+1,num);
    
  }  

  public static void main(String[] args) {
	
	  System.out.println(convertStringToInt("1234"));
	  
	  
	  
}
  
  
  
  
  
}
