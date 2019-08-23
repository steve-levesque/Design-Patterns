/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Facade;
// The facade suggests to hide complicated and useless code from the user and create a new
// class which is friendly and simpler.

// Pros :
// - Friendly methods can help in long term coding in matter of visibility and time.
// Cons :
// - Increases coupling towards the application and the facade.
// - It can give false directions if the facade is wrapping the real logic too efficiently.

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
		Panel panel = new CompanySystem(employees, computers);
		// Friendly methods from the facade, instead of using the loops directly here.
		Employee emp = panel.findEmployeeByName("emp1");
		Computer cpu = panel.findComputerBySerialNumber(1234);
		
		System.out.println("Dep of employee : " + emp.getDepartment() + " - Dep of cpu : " + cpu.getDepartment());
	}
}
