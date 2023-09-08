
public class InterfaceTest implements Test1{
    public void method1 () {
		
	}
    
    public static void main(String[] args) {
    	Test1 t = new  InterfaceTest ();
    	t.method1 ();
	}
    
}


interface Test1 {
	
	public void method1 ();
}
