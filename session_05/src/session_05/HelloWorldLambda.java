package session_05;

// Define HelloWorldInterface
@FunctionalInterface
interface HelloWorldInterface {
    String sayHelloWorld();
}

// Define IncByFiveInterface
@FunctionalInterface
interface IncByFiveInterface {
    int IncByFiveInterface(int x);
}

// Define ConcatenateInterface
@FunctionalInterface
interface ConcatenateInterface {
    void strConcat(String a, String b);
    
    // Static method in interface
    static void print(String a, String b) {
        System.out.println(a + " " + b);
    }
}



public class HelloWorldLambda {
    public static void main(String[] args) {
        // Lambda for HelloWorldInterface
        HelloWorldInterface h = () -> "Hello Java!!!";
        System.out.println(h.sayHelloWorld());

        // Lambda for IncByFiveInterface
        IncByFiveInterface i = (x) -> {
            return x + 5;
        };
        System.out.println("Inc By Five = " + i.IncByFiveInterface(7));

        // Lambda for ConcatenateInterface
        ConcatenateInterface c = (a, b) -> System.out.println(a.concat(b));
        c.strConcat("JSPM", " Wagholi");

        // Static method call
        ConcatenateInterface.print("Java", "Training");
        c.strConcat("Lambda", "!!");
    }
}
