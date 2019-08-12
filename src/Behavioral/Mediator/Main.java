/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;

class Main {
	public static void main(String[] args) {
		PunchClockSystem clock = new PunchClockSystem();
		
		Employee secretary = new Secretary(clock);
		Employee programmer = new Programmer(clock);
		Employee clerk = new Clerk(clock);
		
		secretary.use();
		programmer.use();
		clerk.use();
	}
}
