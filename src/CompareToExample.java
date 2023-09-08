public class CompareToExample{  
	public static void main(String args[]){  
		String s1="hello";  //104
		String s2="hello";  
		String s3="meklo";  //109 	104-109=-5
		String s4="hemlo";  //108-109=-1
		String s5="flag";  //102   104-102=2
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	}}  
