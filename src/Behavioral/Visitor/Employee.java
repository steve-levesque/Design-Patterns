/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;

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
