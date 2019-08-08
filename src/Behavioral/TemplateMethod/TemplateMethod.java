package Behavioral.TemplateMethod;

abstract class Employee {
	
	public void operationSchedule() {
		openComputer();
		work();
		helpClient();
		fillReport();
	}
	
	public void openComputer() {
		System.out.println("Starting Computer.");
	}
	
	abstract void work(); 
	abstract void helpClient();
	abstract void fillReport();
}

class Programmer extends Employee {

	@Override
	void work() {
		System.out.println("Programming.");
	}

	@Override
	void helpClient() {}

	@Override
	void fillReport() {
		System.out.println("Fill programmer report.");
	}
	
}

class Secretary extends Employee {

	@Override
	void work() {
		System.out.println("Paying recipes.");
	}

	@Override
	void helpClient() {
		System.out.println("Client service.");
	}

	@Override
	void fillReport() {
		System.out.println("Filling secretary report.");
	}
	
}

public class TemplateMethod {
	public static void main(String[] args) {
		Employee secretary = new Secretary();
		Employee programmer = new Programmer();
		
		secretary.operationSchedule();
		programmer.operationSchedule();
	}
}
