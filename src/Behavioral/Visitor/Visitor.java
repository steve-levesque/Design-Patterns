package Behavioral.Visitor;

interface Visitor {
	void visitProgrammer(Programmer programmer);
	void visitSecretary(Secretary secretary);
}

class Inspector implements Visitor {

	@Override
	public void visitProgrammer(Programmer programmer) {
		if (programmer.getWorkHours() < 20)
			System.out.println("Work more on the projects.");
	}

	@Override
	public void visitSecretary(Secretary secretary) {
		if (secretary.getWorkHours() > 40)
			System.out.println("Switch off with a college.");
	}
}

abstract class Employee {
	private int workHours;
	
	Employee(int workHours) {
		this.workHours = workHours;
	}
	
	public int getWorkHours() {
		return workHours;
	}

	abstract void talkToInspector(Visitor visitor);
}

class Programmer extends Employee {

	Programmer(int workHours) {
		super(workHours);
	}

	@Override
	public void talkToInspector(Visitor visitor) {
		visitor.visitProgrammer(this);
	}
	
}

class Secretary extends Employee {

	Secretary(int workHours) {
		super(workHours);
	}

	@Override
	public void talkToInspector(Visitor visitor) {
		visitor.visitSecretary(this);
	}
	
}