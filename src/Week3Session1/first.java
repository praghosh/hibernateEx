package Week3Session1;

import java.awt.Button;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
	
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(o.rollno<rollno) {
			return 0;
		}
		else  {
			return -1;

		}
	}
}
public class first{
	public static void main(String args[]) {
		
	 
		System.out.println(b);
		
		ArrayList<Student> st=new ArrayList<Student>();
		st.add(new Student("reena",101));
		st.add(new Student("seema",105));
		st.add(new Student("ritu",102));
		System.out.println(st);
		Collections.sort(st);
		System.out.println(st);
	}
}
 
