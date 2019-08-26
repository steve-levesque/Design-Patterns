/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Prototype;

import java.util.ArrayList;

public class Prototype {
	private ArrayList<Employee> employees;
	
	Prototype() {
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void getEmployeeNames() {
		employees.forEach((emp) -> System.out.println(emp.getName()));
	}
	
	public void cloneAll(int multiplicator) {
		employees.forEach((emp) -> {
				for (int i = 0; i < multiplicator; i++)
					System.out.println(emp.clone().getName());
			}
		);
	}
}
