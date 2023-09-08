package Week6Session5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTesting {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
         Function <String[], Integer> test = x -> {System.out.println("Hello World " +x);return 0;};
         test.apply(null);
//        (int a) -> {System.out.println("value "+a);};
        // Lambda expression without type declarations
        names.forEach((name) -> {System.out.println("Hello, " + name);});
        // Lambda expression with  type declarations
        names.forEach((String name) -> {System.out.println("Hello, " + name);});
        
        names.forEach((String name) -> {
        	   System.out.println("Hello World");
        	   System.out.println(name);
        	    });
 
        

	}

}
