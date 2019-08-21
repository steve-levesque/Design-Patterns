/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;
// This class handles the creation of the object from the sub class depending
// of the behavior needed. The factory makes it so that the application doesn't need
// to be modified if a new type is introduced.

class Factory {
	public Secretary initialize(String workplace) throws Exception {
		if (workplace == "Office")
			return new SecretaryOffice();
		else if (workplace == "Field")
			return new SecretaryField();
		else
			throw new Exception("Workplace not supported by the secretaries to provide reports.");
	}
}
