package Week6Session5;

@FunctionalInterface
interface  FunctionalInterfaceSingleParam {

	//An abstract method with single parameter
	public int squareTheNumber(int a);
}
public class LamdaExpresssionSingleParam {

	public static void main(String args[]) {
		// lambda expression with single parameter num
		FunctionalInterfaceSingleParam f = num -> num*num;
		System.out.println(f.squareTheNumber(25));
	}
}
