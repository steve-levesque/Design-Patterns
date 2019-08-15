/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Strategy;
// The strategy suggests that a method or a class doing an action with multiple
// implementations different from one another but resulting in the same
// Answer should be separated into different parts (strategies).

// Pros : 
// - Adds abstraction between functionalities.
// - Reduces possible coupling with the current code.
// Cons :
// - The selection of a strategy must now be implemented.

class Main {
	public static void main(String[] args) {
		// Main class, waiting for the user to select a strategy.
		Operation work = new Operation(new JuniorProgrammer(), 3);
		work.executeOperation();
		
		// Trying other strategies.
		work.setEmployee(new Programmer());
		work.executeOperation();
		work.setEmployee(new SeniorProgrammer());
		work.executeOperation();
	}
}
