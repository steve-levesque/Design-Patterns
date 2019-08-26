/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;
// The state suggests to create a class for each possible object status and to
// implement its behavior inside each of them instead of having a single object
// filled with all possible actions. 

// Pros :
// - Simplification of conditional evaluations. Instead of evaluating every methods of a monolith, the application class
//   can simply evaluate which class is needed and use all the methods inside it.
// Cons :
// - Each state must be an object.

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.checkAccount();
		computer.enterPasswordClient();
		computer.checkAccount();
	}
}
