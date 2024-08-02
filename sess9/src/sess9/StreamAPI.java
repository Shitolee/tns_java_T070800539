package sess9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
       public static void main(String[] args) {
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6);//list of array
		System.out.println(numbers);
		List<Integer> square = numbers.stream().map(x-> x*x).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> names = Arrays.asList("Shivani", "Shraddha", "Shubham", "Shourylaxmi");
		List<String> result = names.stream().filter(s -> s.startsWith("N")).collect(Collectors.toList());
		System.out.println("Result = "+result);
	}
}