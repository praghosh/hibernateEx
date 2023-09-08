package Week3Session1;

class Baseclass 
{ 
	private int privateVariable = 30; 
	protected int protectedVariable = 50; 
	private void privateMethod() 
	{ 
		System.out.println("Base class private  method"); 
	} 
	protected void protectedMethod() 
	{ 
		System.out.println("Base class protected  method"); 
	} 
} 
class Derivedclass extends Baseclass 
{ 

}

class AnotherClass extends Baseclass {
	
}
public class CheckAccessControl { 
	public static void main(String[] args) 
	{ 
		// Protected class can be accessed even after further subclassing. 
		AnotherClass an = new AnotherClass ();
		an.protectedMethod();
		System.out.println(an.protectedVariable);
	} 
}