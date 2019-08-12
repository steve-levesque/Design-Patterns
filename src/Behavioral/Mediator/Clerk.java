/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;

class Clerk extends Employee {

	Clerk(Mediator mediator) {
		super(mediator);
	}

	@Override
	void use() {
		mediator.notify(this, "Punching");
	}
	
}