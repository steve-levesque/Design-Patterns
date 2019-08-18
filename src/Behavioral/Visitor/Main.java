/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;
// The visitor suggests to separate the algorithm (methods) from the objects that would
// normally possess them in another class. The visitor class would then use the methods 
// which corresponds the class that uses the visitor object.

class Main {
	public static void main(String[] args) {
		Visitor inspector = new Inspector();
		
		Employee secretary = new Secretary(45);
		Employee programmer = new Programmer(10);
		
		secretary.talkToInspector(inspector);
		programmer.talkToInspector(inspector);
	}
}
