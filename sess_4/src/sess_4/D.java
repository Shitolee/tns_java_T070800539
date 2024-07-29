package sess_4;

public class D extends C{
	
	public void m1() {
		System.out.println("In m1() of D");
	}
	
	public void m2() {
		System.out.println("In m2() of D");
	}
	
	public static void main(String [] args) {
		D d = new D();
		C c1 = new C();
		C c = new D();//Polymorphic reference
		c.m1();
		((D) c).m2();//downcasting reference from super to sub
		
		//Instance of operator
		//It is used to check type of the object
		System.out.println(d instanceof C);//true
		System.out.println(c1 instanceof C);//true
		System.out.println(c1 instanceof D);//false
		System.out.println(c instanceof C);//true
		System.out.println(c instanceof D);//true
	}

}