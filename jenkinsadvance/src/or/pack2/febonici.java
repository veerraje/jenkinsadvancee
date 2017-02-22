package or.pack2;

public class febonici {
	static	int n1=0, n2=2, n3 =0;
	 
	  static	void m1(int count){
		if(count>0){
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.print(n3);
			m1(count-1);
		}
	  }
	public static void main(String[] args) {
		int count =10;
System.out.print(n1);
System.out.print(n2);
m1(count-2);

	}

}
