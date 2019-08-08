package Behavioral.Mediator;

interface Mediator {
	void notify(Employee component, String event);
}

class PunchClockSystem implements Mediator {

	@Override
	public void notify(Employee component, String event) {
		String type = component.getClass().getSimpleName().toString();
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
				System.out.println("Thank you.");
		}
	}
	
}

abstract class Employee {
	protected Mediator mediator;
	
	Employee(Mediator mediator) {
		this.mediator = mediator;
	}
	
	abstract void use();
}

class Secretary extends Employee {

	Secretary(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void use() {
		mediator.notify(this, "Report Bug");
	}
}

class Programmer extends Employee {

	Programmer(Mediator mediator) {
		super(mediator);
	}

	@Override
	void use() {
		mediator.notify(this, "Restarting");
	}
	
}

class Clerk extends Employee {

	Clerk(Mediator mediator) {
		super(mediator);
	}

	@Override
	void use() {
		mediator.notify(this, "Punching");
	}
	
}