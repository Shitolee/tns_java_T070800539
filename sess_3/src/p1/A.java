package p1;



public class A {

	public static int fees=10000;
	 protected int a = 10;
	 
	
	 protected void getNo() {
		System.out.println("a =" + a);
		
	}
	 
	 public void getFees() {
		 System.out.println("Fees = " + fees);
	 }
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("a=" +a.a);
		a.a=100;
		System.out.println("a =" + a.a);
		a.getNo();
	
		
	}
}
