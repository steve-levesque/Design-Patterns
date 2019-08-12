/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.TemplateMethod;

class Main {
	public static void main(String[] args) {
		Employee secretary = new Secretary();
		Employee programmer = new Programmer();
		
		secretary.operationSchedule();
		programmer.operationSchedule();
	}
}
