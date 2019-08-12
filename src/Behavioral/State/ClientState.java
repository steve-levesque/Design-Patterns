/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;

class ClientState extends ComputerState {

	ClientState(Computer computer) {
		super(computer);
	}
	
	@Override
	void enterPasswordClient(ClientState clientState) {	}

	@Override
	void enterPasswordModerator(ModeratorState moderatorState) { }

	@Override
	void enterPasswordAdmin(AdminState adminState) { }

	@Override
	void checkAccount() {
		System.out.println("Welcome to your account.");
	}

	@Override
	void checkAdminSite() {
		System.out.println("Permission not satisifed.");
	}

	@Override
	void changeAdminSite() {
		System.out.println("Permission not satisifed.");
	}
}