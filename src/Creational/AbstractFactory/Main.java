/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;
// The Abstract Factory follows the same design as the Factory Method. Thus, with another level
// of abstraction for the factories. Now, the product layer and the factory layer has both their
// own global interfaces.

// Pros :
// - Adding a whole dimension or removing it won't couple or break the code.
// Cons :
// - All layers needs to extend/implement their respective abstract class or interface to work with
//   the base application.

class Main {
	public static void main(String[] args) throws Exception { 
		// Set 1.
		// Factory layer.
		Employee employee1 = new FactoryBuilder().initialize("Secretary");
		// Product layer.
		Report report1 = employee1.fillReportField();
		Report report2 = employee1.fillReportOffice();
		
		// Set 2, same procedure and interfaces...
		Employee employee2 = new FactoryBuilder().initialize("Programmer");
		Report report3 = employee2.fillReportField();
		Report report4 = employee2.fillReportOffice();
		
		// All reports from employees (adding another type for each layers won't break the application).
		report1.content();
		report2.content();
		report3.content();
		report4.content();
	}
}
