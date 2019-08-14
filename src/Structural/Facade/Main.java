/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Facade;

import java.util.ArrayList;

class Main {
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Computer> computers = new ArrayList<Computer>();
	
	static {
		employees.add(new Employee("emp1", "Programming"));
		employees.add(new Employee("emp2", "Secretary"));
		
		computers.add(new Computer(1234, "Programming"));
		computers.add(new Computer(4321, "Secretary"));
	}
	
	 
	public static void main(String[] args) {
		Panel panel = new Company(employees, computers);
		
		Employee emp = panel.findEmployeeByName("emp1");
		Computer cpu = panel.findComputerBySerialNumber(1234);
		
		System.out.println("Dep of employee : " + emp.getDepartment() + " - Dep of cpu : " + cpu.getDepartment());
	}
}
