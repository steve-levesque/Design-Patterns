/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;

abstract class Employee {
	protected Mediator mediator;
	
	Employee(Mediator mediator) {
		this.mediator = mediator;
	}
	
	abstract void use();
}
