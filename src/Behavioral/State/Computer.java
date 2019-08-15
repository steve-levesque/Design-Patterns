/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;
// The main class contains the state and uses its methods instead of its own.
class Computer {
	private ComputerState state;
	
	Computer() {
		this.state = new LockedState(this);
	}
	
	public void changeState(ComputerState state) {
		this.state = state;
	}
	
	public void enterPasswordClient() {
		state.enterPasswordClient(new ClientState(this));
	}
	
	public void enterPasswordModerator() {
		state.enterPasswordModerator(new ModeratorState(this));
	}

	public void enterPasswordAdmin() {
		state.enterPasswordAdmin(new AdminState(this));
	}
	
	public void checkAccount() {
		state.checkAccount();
	}
	
	public void checkAdminSite() {
		state.checkAdminSite();
	}
	
	public void changeAdminSite() {
		state.changeAdminSite();
	}
}
