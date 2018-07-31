package BasicsOfImplementation;

public class RemoveAllOccurences {

	
	
	public static void main(String[] args) {
		
		removeAllOccurrencesOfChar("what is the source of  love and source of diorientation", 'e');
	
	}

		public static void removeAllOccurrencesOfChar(String input, char c) {
				for(int i=0;i<input.length();i++) {
					if(input.charAt(i)==c)
					{				
						input=input.substring(0, i)+input.substring(i+1);
						i--;
					}
				}
		System.out.println(input);
		
		}
	}

