/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;

class Secretary extends Employee {
	
	Secretary(String name) {
		super(name);
	}
	
	public void getName() {
		System.out.println(this.data.getName()+" is a secretary.");
	}
}
