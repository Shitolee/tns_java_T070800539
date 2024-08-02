package sess11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
public static void main(String[] args) {
	 
//	HashSet  h = new HashSet();
	LinkedHashSet h =new LinkedHashSet();
	h.add(null);
	h.add("a");
	h.add("A");
	h.add(10);
	h.add("Z");
	System.out.println(h);
	
	System.out.println(h.size());
	System.out.println(h.remove("A"));
	System.out.println(h);   
	
}
}