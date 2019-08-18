/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Command;
// The command suggests that the business logic of the requests should not be known and to prevent
// this from happening, a command class should be initialized in the middle. This class would contain
// all the request objects and a method to trigger all the request's commands.

class Main {
	public static void main(String[] args) {
		Command command = new Command();
		
		command.addAppointments(new Evening());
		command.addAppointments(new Day());
		command.addAppointments(new Night());
		
		command.showAppointments();
	}
}
