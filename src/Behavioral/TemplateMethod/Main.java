/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.TemplateMethod;
// The template suggests to establish the steps of execution of the algorithm in the super class
// and accept minor overriding changes from the sub classes that wouldn't change the execution
// steps' whole nature.

// Pros :
// - No need to define the code's path of execution manually.
// - Code reuse is possible in cases when some methods aren't reusable.
// Cons : 
// - If sub classes are encapsulated, the path of execution must be changed in the super class.

class Main {
	public static void main(String[] args) {
		// Sub classes contains overridden or empty methods and cases which see fits. 
		Employee secretary = new Secretary();
		Employee programmer = new Programmer();
		
		secretary.operationSchedule();
		programmer.operationSchedule();
	}
}
