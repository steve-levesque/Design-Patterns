/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class FactoryBuilder {
	public Employee initialize(String employeeType) throws Exception {
		if (employeeType == "Secretary")
			return new Secretary();
		else if (employeeType == "Programmer")
			return new Programmer();
		else
			throw new Exception("Employee not supported to provide reports.");
			
	}
}
