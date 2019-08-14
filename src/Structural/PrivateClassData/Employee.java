/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;
// Encapsulated values cannot be written from other ways than the constructor.

abstract class Employee {
	protected Data data;

	Employee(String name) {
		data = new Data(name);
		//data.setName();
		//data.name = name;
	}
	
	abstract void getName();
}
