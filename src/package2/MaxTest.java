package package2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxTest {

	public static void main(String a[]){

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Ajay", 22000));
		emps.add(new Employee(130, "Vijay", 35000));
		emps.add(new Employee(110, "John", 13000));
		emps.add(new Employee(120, "Akbar", 23000));
		Employee maxSal = Collections.max(emps, new EmpyComp());
		System.out.println("Employee with max salary: "+maxSal);
		
		List <Integer> list = Arrays.asList(new Integer[] { 10, 20, 30, 40, 20, 10 });
		Integer maxInteger = Collections.max(list);
		System.out.println("The larget Integer here: "+maxInteger);
	}
}

class EmpyComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
}

class Employee{

	private int id;
	private String name;
	private Integer salary;

	public Employee(int id, String name, Integer sal){
		this.id = id;
		this.name = name;
		this.salary = sal;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String toString(){
		return name+"(Emp ID: " + id + ") Salary: "+salary;
	}
}
