package sess_1;

public class Demo3 {
//	public void add(int a, int b) {
//	int sum = a+b;
//	System.out.println("Addition = "+ sum);
//}
//
//public int add(int a, int b, int c) {
//	return (a+b+c);
//}

public int add(String s, int...a) {
	System.out.println("Length = " + a.length);
	int sum =0;
	for(int i=0; i<a.length; i++)
	{
		sum = sum + a[i];
		//sum += a[i];
	}
	return sum;		
}

public static void main(String[] args) {
	Demo3 d = new Demo3();
	int a = d.add("abc =", 10, 20);
	//System.out.println("Addition = " + s);
	System.out.println("sum = " + d.add("mno", 1,2,3));
}
}

