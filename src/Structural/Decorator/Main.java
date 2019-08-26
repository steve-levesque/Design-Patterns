/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;
// The decorator suggests to link all the sub classes (addons extended of the base decorator separated from the main addon)
// by using the aggregation or the composition instead of inheritance to create a "stack" which contains all the decorators
// below the main component. 

// Pros :
// - The behavior of the "stack" can be changed at runtime.
// - The "stack" is not stuck on the behavior of only one super class, it can delegate some work
//   from whatever class it may see fit
// Cons :
// - All possible classes to be included in the stack must share the same interface.
// - The order of the decorators inside the stack matters.

class Main {
	public static void main(String[] args) {
		Graphic stack = new CoreDisplay();	
		stack = new LineDisplay(stack);
		stack = new BarDisplay(stack);
		
		// Core -> Line -> Bar
		stack.show();
	}
}
