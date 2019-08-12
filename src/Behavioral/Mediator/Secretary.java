/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;

class Secretary extends Employee {

	Secretary(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void use() {
		mediator.notify(this, "Report Bug");
	}
}
