package empsal.com;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

public class EmpSalFilterByLambda {
	public static List<Employee> emplist() {
	List<Employee> al = new ArrayList<Employee>();
	al.add(new Employee(112, "Nikhil", "Mumbai", 2010, 28000.00));
	al.add(new Employee(104, "Raj", "Pune", 2020, 18000.00));
	al.add(new Employee(103, "Akash", "Barshi", 2016, 23000.00));
	al.add(new Employee(101, "Abhhi", "Banglore", 2012, 8000.00));
	al.add(new Employee(102, "Ram", "Virar", 2035, 2000.00));
	al.add(new Employee(110, "Shyam", "Barshi", 2023, 27000.00));
	return al;
}
	public static void main(String args[]) {

			List <Employee> list=emplist();		

			System.out.println("filtering the list!");
			list.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList()).forEach(n->System.out.println(n));
			
			
			System.out.println("hiking salary of employee whose salary is less than 25000 and adding 5000----->");
//			list.stream().filter(e->e.getName().startsWith("A")).toList().forEach(n->System.out.println(n.getName()+" "+n.getCity()));
			
			list.stream().filter(e->e.getSalary()>25000).map(n->n.getSalary()+5000).collect(Collectors.toList()).forEach(System.out::println);
	}
}