/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;

class Programmer extends Employee {
	
	Programmer(String name) {
		super(name);
	}
	
	public void getName() {
		System.out.println(this.data.getName()+" is a programmer.");
	}
}
