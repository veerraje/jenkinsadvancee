package or.pack3;

public class stringrevers {

	public static void main(String[] args) {
		String str = "gitrepository";
		
			char[] strArray = str.toCharArray();

			for (int i = strArray.length - 1; i >= 0; i--)
			{
				System.out.print(strArray[i]);     //Output : avaJyM
			}

	}

}
