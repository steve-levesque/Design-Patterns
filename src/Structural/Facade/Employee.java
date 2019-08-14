/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Facade;

class Employee {
	private String name;
	private String department;
	
	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
