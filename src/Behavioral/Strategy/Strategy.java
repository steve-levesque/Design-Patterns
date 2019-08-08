package Behavioral.Strategy;

class Operation {
	private int difficulty;
	private Employee employee;
	
	Operation(Employee employee, int difficulty) {
		this.employee = employee;
		this.difficulty = difficulty;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void executeOperation() {
		employee.executeOperation(difficulty);
	}
}

interface Employee {
	void executeOperation(int difficulty);
}

class JuniorProgrammer implements Employee {
	private int experience = 1;
	
	@Override
	public void executeOperation(int difficulty) {
		if (difficulty <= experience)
			System.out.println("Junior programmer can complete the operation.");
		else
			System.out.println("Junior programmer needs more experience.");
	}
}

class Programmer implements Employee {
	private int experience = 2;

	@Override
	public void executeOperation(int difficulty) {
		if (difficulty <= experience)
			System.out.println("Programmer can complete the operation.");
		else
			System.out.println("Programmer needs more experience.");
	}
}

class SeniorProgrammer implements Employee {
	private int experience = 3;
	
	@Override
	public void executeOperation(int difficulty) {
		if (difficulty <= experience)
			System.out.println("Senior programmer can complete the operation.");
		else
			System.out.println("Senior programmer needs more experience.");
	}
}

public class Strategy {
	public static void main(String[] args) {
		Operation work = new Operation(new JuniorProgrammer(), 3);
		work.executeOperation();
		work.setEmployee(new Programmer());
		work.executeOperation();
		work.setEmployee(new SeniorProgrammer());
		work.executeOperation();
	}
}
