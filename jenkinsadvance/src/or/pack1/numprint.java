package or.pack1;

public class numprint {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++){
			for(int j =0; j<i; j++){
				System.out.print(((i+j)%2)+" ");
			}
			System.out.println(" ");
		}

	}

}
