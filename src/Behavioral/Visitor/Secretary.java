/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;

class Secretary extends Employee {

	Secretary(int workHours) {
		super(workHours);
	}

	@Override
	public void talkToInspector(Visitor visitor) {
		visitor.visitSecretary(this);
	}
	
}