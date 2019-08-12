/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.TemplateMethod;

class Secretary extends Employee {

	@Override
	void work() {
		System.out.println("Paying recipes.");
	}

	@Override
	void helpClient() {
		System.out.println("Client service.");
	}

	@Override
	void fillReport() {
		System.out.println("Filling secretary report.");
	}
	
}
