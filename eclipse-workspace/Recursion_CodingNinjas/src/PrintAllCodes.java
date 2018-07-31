
public class PrintAllCodes {


	static	char mapping(String str) {
		if(str.length()==1)
		{
			int k=str.charAt(0)-'0';
			return (char)(k+96);
		}
		else {
			int k=(str.charAt(0)-'0')*10+(str.charAt(1)-'0');
			return (char)(96+k);
		}
	}

	static void allCodes(String str,String output) {

		if(str.length()==0) {
			System.out.println(output);
			return;
		}
		char map=mapping(str.substring(0,1));
		allCodes(str.substring(1),output+map);

		String sp;
		if(str.length()>=2) {
			sp=str.substring(0,2);

			char map1=mapping(sp);
			if(map1<='z')
			{	output=output+map1;
			//if(str.length()>2)
			allCodes(str.substring(2), output);

			}

		}
	}

	public static void main(String[] args) {


		allCodes("1123", "");



	}

}
