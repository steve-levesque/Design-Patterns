/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;
// The sub classes will use the visitor class to access new implemented methods.

abstract class Employee {
	private int workHours;
	
	Employee(int workHours) {
		this.workHours = workHours;
	}
	
	public int getWorkHours() {
		return workHours;
	}

	abstract void talkToInspector(Visitor visitor);
}
