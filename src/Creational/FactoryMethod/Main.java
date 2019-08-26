/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;
// The Factory Method suggests to initialize an object from a factory which may return
// altered behaviors depending of the sub class it uses instead of using direct initialization.

// Pros :
// - Reduces coupling between types of logistics.
// - The application in question does not need to know any specific sub classes to work.
// Cons :
// - All sub classes needs to extend/implement the same base class used by the factory/application.

class Main {
	public static void main(String[] args) throws Exception {
		Secretary secretary1 = new Factory().initialize("Field");
		Secretary secretary2 = new Factory().initialize("Office");
		
		secretary1.report();
		secretary2.report();
	}
}
