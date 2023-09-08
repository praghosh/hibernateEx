package ajpPretest;


public class TestClass{
	public static void main(String[] args) {

		int x = 5;
		int y = 3;
		int z = 7;

		if (x > y) {
		    if (y < z) {
		        System.out.println("A");
		    } else if (x > z) {
		        System.out.println("B");
		    } else {
		        System.out.println("C");
		    }
		} else {
		    System.out.println("D");
		}




	}

	static Integer funn (Integer a, Integer b, Integer c) {
		c=b+c ;    
		b=(b+b)+b;     
		c=(10+6)&a ;    
		c=(4+8)&b ;    
		b=(a+c)&c   ;  

		return (a+b+c);
	}
}