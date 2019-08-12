/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;

class Programmer extends Employee {

	Programmer(int workHours) {
		super(workHours);
	}

	@Override
	public void talkToInspector(Visitor visitor) {
		visitor.visitProgrammer(this);
	}
	
}
