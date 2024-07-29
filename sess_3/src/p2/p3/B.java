package p2.p3;

//import static p1.A.*;
import static p1.A.fees;
import static java.lang.System.out;

import java.io.IOException;

public class B {
	
	
	public static void main(String[] args) throws IOException{
		out.println("Fees = " +  fees);
		out.println("Enter any Character = ");
		int i = System.in.read();
		System.out.println("i = " +  i);
		System.err.print("Error");
	}
}