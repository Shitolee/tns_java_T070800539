package sess_4;

public class A extends Demo{
	
	private int no = 10;
	
	public A() {
		System.out.println("In default of A");
	}
	
	public A(int a)
	{
		System.out.println("In parameterized of A " + a);
	}
	
	public void getNo()
	{
		System.out.println("In A");
	}

}