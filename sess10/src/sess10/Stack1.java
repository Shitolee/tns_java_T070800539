package sess10;

import java.util.Stack;

public class Stack1 {
   public static void main(String[] args) {
	Stack v = new Stack();
	v.push(10);
	v.push("Shivani");
	v.push(null);
	v.push('A');
	v.push(10);
	
	System.out.println(v);
	v.pop();
	System.out.println(v);
	System.out.println(v.size());
	
	
}
}