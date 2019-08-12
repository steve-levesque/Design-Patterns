/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;

class AdminState extends ComputerState {

	AdminState(Computer computer) {
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
		System.out.println("Welcome to the admin site.");
	}

	@Override
	void changeAdminSite() {
		System.out.println("Welcome to the admin site, CRUD activated.");
	}
}
