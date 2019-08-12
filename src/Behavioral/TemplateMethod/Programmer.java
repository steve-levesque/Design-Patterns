/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.TemplateMethod;

class Programmer extends Employee {

	@Override
	void work() {
		System.out.println("Programming.");
	}

	@Override
	void helpClient() {}

	@Override
	void fillReport() {
		System.out.println("Fill programmer report.");
	}
	
}