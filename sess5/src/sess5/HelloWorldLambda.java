package sess5;


@FunctionalInterface
interface HelloWorldInterface {
 String sayHelloWorld();
}


@FunctionalInterface
interface IncByFiveInterface {
 int IncByFiveInterface(int x);
}


@FunctionalInterface
interface ConcatenateInterface {
 void strConcat(String a, String b);
 

 static void print(String a, String b) {
     System.out.println(a + " " + b);
 }
}



public class HelloWorldLambda {
 public static void main(String[] args) {
  
     HelloWorldInterface h = () -> "Hello Java!!!";
     System.out.println(h.sayHelloWorld());

     IncByFiveInterface i = (x) -> {
         return x + 5;
     };
     System.out.println("Inc By Five = " + i.IncByFiveInterface(7));

   
     ConcatenateInterface c = (a, b) -> System.out.println(a.concat(b));
     c.strConcat("JSPM", " Wagholi");

     ConcatenateInterface.print("Java", "Training");
     c.strConcat("Lambda", "!!");
 }
}
