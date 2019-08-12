/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;

abstract class ComputerState {
	protected Computer computer;
	
	ComputerState(Computer computer) {
		this.computer = computer;
	}
	
	abstract void enterPasswordClient(ClientState clientState);
	abstract void enterPasswordModerator(ModeratorState moderatorState);
	abstract void enterPasswordAdmin(AdminState adminState);
	abstract void checkAccount();
	abstract void checkAdminSite();
	abstract void changeAdminSite();
}
