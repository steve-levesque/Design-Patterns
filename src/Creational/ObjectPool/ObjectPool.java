package Creational.ObjectPool;

import java.util.ArrayList;

class ComputerOP {
	private String code;
	private HiredEmployee employee;
	
	public ComputerOP(String code, HiredEmployee employee) {
		this.code = code;
		this.employee = employee;
	}
	
	public HiredEmployee getEmployee() {
		return employee;
	}
	
	public void setEmployee(HiredEmployee employee) {
		this.employee = employee;
	}
}

class HiredEmployee {
	String name;
	private Boolean isWorking = true;
	
	public HiredEmployee(String name) {
		this.name = name;
	}
	
	public void isFired() {
		this.isWorking = false;
		System.out.println("Eployee "+this.name+" is now fired.");
	}
	
	public Boolean isWorking() {
		return isWorking;
	}
}

public class ObjectPool {
    private static ObjectPool instance = null; 
    private ArrayList<ComputerOP> computers;
	
	private ObjectPool() {
		computers = new ArrayList<ComputerOP>();
		computers.add(new ComputerOP("cpu1", null));
		computers.add(new ComputerOP("cpu2", null));
		computers.add(new ComputerOP("cpu3", null));
	}
	
	public static ObjectPool createCompany() {
		if (instance == null)  {
			instance = new ObjectPool(); 
		}
  
        return instance; 
	}
	
	public int availableComputersCount() {
		int total = computers.size();
		
		for (int i = 0; i < computers.size(); i++) {
			if (computers.get(i).getEmployee() != null) 
				total--;
		}
		
		return total;
	}
	
	public void cleaning() {
		for (int i = 0; i < computers.size(); i++) {
			ComputerOP computer = computers.get(i);
			
			if (computer.getEmployee() != null) {
				if (computer.getEmployee().isWorking() == false)
				computers.get(i).setEmployee(null);
			}
		}
		System.out.println("Object Pool washed.");
	}
	
	public void assignComputer(HiredEmployee employee) {
		for (int i = 0; i < computers.size(); i++) {
			ComputerOP computer = computers.get(i);
			if (computer.getEmployee() == null) {
				computer.setEmployee(employee);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ObjectPool company = ObjectPool.createCompany();
		HiredEmployee emp1 = new HiredEmployee("Steve");
		HiredEmployee emp2 = new HiredEmployee("Someone");
		
		// Number of computers in total.
		System.out.println("Computers in the company: " + company.computers.size());
		
		// Number of available computers.
		System.out.println("Computers that are vacant: " + company.availableComputersCount());
		
		company.assignComputer(emp1);	
		company.assignComputer(emp2);	
		
		// Number of available computers after a merge with an employee and a computer.
		System.out.println("Computers that are vacant: " + company.availableComputersCount());
		
		// Firing an employee.
		emp1.isFired();
		
		// Number of available computers after the employee is fired.
	    // (The object pool is not updated)
		System.out.println("Computers that are vacant: " + company.availableComputersCount());
		
		// Result of Object Pool cleaning.
		company.cleaning();
		System.out.println("Computers that are vacant: " + company.availableComputersCount());
	}
}
