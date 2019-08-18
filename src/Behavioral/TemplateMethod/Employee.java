/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.TemplateMethod;
// The super class contains the execution steps as well as identical 
// steps from all sub classes.

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
