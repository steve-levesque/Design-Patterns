/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;

abstract class Employee {
	protected Data data;

	Employee(String name) {
		data = new Data(name);
	}
	
	abstract void getName();
}
