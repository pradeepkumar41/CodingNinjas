
public class RemoveDuplicatesRecursively {

		public static String removeConsecutiveDuplicates(String s) {

	      if(s.length()==0)
	      {
	        String str=""; return str;
	      }
	      
	      String str2=removeConsecutiveDuplicates(s.substring(2));
	      if(s.charAt(0)==s.charAt(1))
	    	  return s.charAt(1)+str2;
	      
	      return str2;
	  
		}
		
		public static void main(String[] args) {
			
			System.out.println(removeConsecutiveDuplicates("ppppp"));
			
		}
		
	}

