package Week6Session5;

@FunctionalInterface
interface  FunctionalInterfaceNoParam {

	//A method with no parameter
	public String sayHello();
}
public class LambdaExpressionNoParamExample {

	public static void main(String args[]) {
		// lambda expression
		FunctionalInterfaceNoParam msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}
}