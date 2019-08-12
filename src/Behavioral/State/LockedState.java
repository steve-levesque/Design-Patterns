/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;

class LockedState extends ComputerState {

	LockedState(Computer computer) {
		super(computer);
	}

	@Override
	void enterPasswordClient(ClientState clientState) {
		System.out.println("Logged in as Client.");
		this.computer.changeState(clientState);
	}
	
	@Override
	void enterPasswordModerator(ModeratorState moderatorState) {
		System.out.println("Logged in as Moderator.");
		this.computer.changeState(moderatorState);
	}

	@Override
	void enterPasswordAdmin(AdminState adminState) {
		System.out.println("Logged in as Admin.");
		this.computer.changeState(adminState);
	}

	@Override
	void checkAccount() {
		System.out.println("Locked");
	}

	@Override
	void checkAdminSite() {
		System.out.println("Locked");
	}

	@Override
	void changeAdminSite() {
		System.out.println("Locked");
	}
}
