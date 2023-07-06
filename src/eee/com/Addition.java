package eee.com;

 class Addition {
	 void ADD(long a ,int b,long c,int s) {
		System.out.println("ADD total="+(a/b+c*s));
		
	}
	 void SUBRATION(int a , int b) {
		System.out.println("SUB total="+(a-b));
		
	}
	 void MULTIPLE(double a,double b) {
		System.out.println("MUL total="+(a*b));
		
	}
	 void DIVIDED(long i, double d) {
		System.out.println("DIV total="+(i/d));
		
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.ADD(978819, 10000000, 11, 00);
		a.SUBRATION(95, 10);
		a.MULTIPLE(232345, 0.3450000);
		a.DIVIDED(4546, 0.124);

	}
}