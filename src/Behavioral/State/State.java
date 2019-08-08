package Behavioral.State;

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

class ClientState extends ComputerState {

	ClientState(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void enterPasswordClient(ClientState clientState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void enterPasswordModerator(ModeratorState moderatorState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void enterPasswordAdmin(AdminState adminState) {
		// TODO Auto-generated method stub
		
	}

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

class ModeratorState extends ComputerState {

	ModeratorState(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void enterPasswordClient(ClientState clientState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void enterPasswordModerator(ModeratorState moderatorState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void enterPasswordAdmin(AdminState adminState) {
		// TODO Auto-generated method stub
		
	}
	
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
		System.out.println("Permission not satisifed.");
	}

}

class AdminState extends ComputerState {

	AdminState(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void enterPasswordClient(ClientState clientState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void enterPasswordModerator(ModeratorState moderatorState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void enterPasswordAdmin(AdminState adminState) {
		// TODO Auto-generated method stub
		
	}

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

public class State {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.checkAccount();
		computer.enterPasswordClient();
		computer.checkAccount();
	}
}
