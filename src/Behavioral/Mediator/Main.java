/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;
// The mediator suggests that any direct communications between objects are not acceptable. If there is a
// conditional event between objects, the contact must be made in another object, the meditator.

// Pros :
// - All action components/methods are at the same place.
// - Old components can easily work with new code and the opposite.  
// Cons :
// - Even if an object doesn't depend of any other objects, a link to the mediator is necessary
//   to access the needed component, since all components are now in the mediator class.

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
