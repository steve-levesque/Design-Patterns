/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;

class PunchClockSystem implements Mediator {

	@Override
	public void notify(Employee component, String event) {
		String type = component.getClass().getSimpleName().toString();
		
		System.out.println("From clock system. Employee type : " + type);
		
		if (type.equals("Programmer")) {
			if (event == "Restarting") 
				System.out.println("Clock system restarting.");
		}
		else if (type.equals("Secretary")) {
			if (event == "Report Bug") 
				System.out.println("Bug reported from secretary.");
		}
		else if (type.equals("Clerk")) {
			if (event == "Punching") 
				System.out.println("Thank you for clocking in.");
		}
		
	}
	
}
