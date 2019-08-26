/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Bridge;
// The bridge suggests to split an application with two distinct families into two independent
// categories. The main category will have a composition link the other one in order to reduce the number of
// classes made by inheritance. 

// Pros :
// - Adding a class will not create a multiplication of other duplicated classes in the hierarchy.
// - 
// Cons :
// - If the application isn't evolutionary or made to be scalable (normally the case of embedded softwares),
//   the bridge has no real use.

class Main {
	public static void main(String[] args) {
		// The main category (Employees) contains the second category (Works).
		HumanRessource secretary1 = new SecretaryField("Someone", new EnteryPay());
		HumanRessource secretary2 = new SecretaryOffice("Someone abc", new Booking());
		
		secretary1.doWork();
		secretary2.doWork();
	}
}
