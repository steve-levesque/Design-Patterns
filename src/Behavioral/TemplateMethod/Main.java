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

class Main {
	public static void main(String[] args) {
		// Sub classes contains overridden or empty methods and cases which see fits. 
		Employee secretary = new Secretary();
		Employee programmer = new Programmer();
		
		secretary.operationSchedule();
		programmer.operationSchedule();
	}
}
