package sess5;



import sess5.AllCalculations;
import sess5.Factorial;
import sess5.StaticCal;

interface StaticCal {
    void add(int a, int b);
    int sub(int a, int b);
    void avg(int a, int b);
}
class Factorial {
   
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class AllCalculations extends Factorial implements StaticCal {
  
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

  
    public int sub(int a, int b) {
        return a - b;
    }

 
    public void avg(int a, int b) {
        int avg = (a + b) / 2;
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        AllCalculations a = new AllCalculations();
        a.add(10, 20);
        System.out.println("Sub = " + a.sub(23, 11));
        a.avg(7, 8);
        
        System.out.println("Factorial of 5 = " + a.factorial(5));
    }
}

