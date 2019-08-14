/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;
// The private class suggests that data meant to be initialized once should be encapsulated
// outside the main class to a data class which sets it only with the constructor in instantiation.
// It is still possible to leave attributes with specific setters if needed. Otherwise, all encapsulated
// attributes are bound to be private (impossible to do from a method outside the data class "this.value = value").

// Pros :
// - Added layer of security towards unwanted exposure of attributes.
// - Separation of data attributes from application classes.
// Cons :
// - Respecting this pattern on large applications can result in a large number of files.
// - Increase of coupling between application classes and data classes.

class Main {
	public static void main(String[] args) {
		Employee emp1 = new Programmer("Programmer1");
		Employee emp2 = new Secretary("Secretary1");
		
		emp1.getName();
		emp2.getName();
	}
}
