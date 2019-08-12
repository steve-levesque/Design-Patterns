/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Strategy;

class Operation {
	private int difficulty;
	private Employee employee;
	
	Operation(Employee employee, int difficulty) {
		this.employee = employee;
		this.difficulty = difficulty;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void executeOperation() {
		employee.executeOperation(difficulty);
	}
}
