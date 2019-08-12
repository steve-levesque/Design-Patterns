/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.TemplateMethod;

abstract class Employee {
	
	public void operationSchedule() {
		openComputer();
		work();
		helpClient();
		fillReport();
	}
	
	public void openComputer() {
		System.out.println("Starting Computer.");
	}
	
	abstract void work(); 
	abstract void helpClient();
	abstract void fillReport();
}
