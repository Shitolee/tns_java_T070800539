package sess11;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        
        // Example usage
        int result1 = comparator.compare(10, 20);
        int result2 = comparator.compare(20, 10);
        int result3 = comparator.compare(10, 10);

        System.out.println("Comparing 10 and 20: " + result1); // Should print +1
        System.out.println("Comparing 20 and 10: " + result2); // Should print -1
        System.out.println("Comparing 10 and 10: " + result3); // Should print 0
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return +1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
