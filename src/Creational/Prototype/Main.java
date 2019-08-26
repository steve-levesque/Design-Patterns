/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Prototype;
// The prototype suggests to clone an object from within the actual one instead of trying to replicate
// it manually (initialization and copy/pasting of the object's values). Since fields can be private,
// manual cloning would result in an incomplete object. 

// Pros :
// - Reduces coupling between the original class and the clone.
// Cons :
// - Each class that needs to support object cloning must implement the cloning logic or
//   have a super class that possess it.

public class Main {
	public static void main(String[] args) {		
		// Multiple cloning.
		Prototype prototype = new Prototype();
		
		prototype.addEmployee(new Secretary("original secretary"));
		prototype.addEmployee(new Clerk("original clerk"));
		
		prototype.getEmployeeNames();
		prototype.cloneAll(2);
		
		// Single object cloning.
		Secretary secretary = new Secretary("Secertary1");
		Employee clone = secretary.clone();
		System.out.println(clone.getName());
	}
}
