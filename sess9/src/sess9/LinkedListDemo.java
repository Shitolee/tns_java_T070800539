package sess9;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
       public static void main(String[] args) {
	   LinkedList l = new LinkedList();
	   l.add("Shivani");
	   l.add(23);
	  // l.add(null);
	   l.add("Shraddha");
	   l.add("Shubham");
	   
	   System.out.println(l);
	   
	   l.set(0, "Shivraj");
	   System.out.println(l);
	   
	   l.removeFirst();
	   l.removeLast();
	   System.out.println(l);
	   
	   ListIterator itr = l.listIterator();
	   while(itr.hasNext()) {
		   Object o = itr.next();
		   if(o.equals(23)) {
			   itr.set("Shourya");
		   }
	   }
	   System.out.println(l);
	   
	   while(itr.hasPrevious()) {
		   Object n = itr.previous();
		   System.out.println(n);
	   }
	   System.out.println(l);
	}
}