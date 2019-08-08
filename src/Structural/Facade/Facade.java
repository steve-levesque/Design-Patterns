package Structural.Facade;

import java.util.ArrayList;

interface Panel {
	EmployeeFacade findEmployeeByName(String name);
	ComputerFacade findComputerBySerialNumber(int number);
}

class CompanyFacade implements Panel {
	private ArrayList<EmployeeFacade> employees;
	private ArrayList<ComputerFacade> computers;
	
	CompanyFacade(ArrayList<EmployeeFacade> employees, ArrayList<ComputerFacade> computers) {
		this.employees = employees;
		this.computers = computers;
	}
	
	@Override
	public EmployeeFacade findEmployeeByName(String name) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getName() == name) {
				return employees.get(i);
			}
		}
		return null;
	}

	@Override
	public ComputerFacade findComputerBySerialNumber(int number) {
		for (int i = 0; i < computers.size(); i++) {
			if (computers.get(i).getSerialNumber() == number) {
				return computers.get(i);
			}
		}
		return null;
	}
}

class EmployeeFacade {
	private String name;
	private String department;
	
	EmployeeFacade(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

class ComputerFacade {
	private int serialNumber;
	private String department;
	
	ComputerFacade(int serialNumber, String department) {
		this.serialNumber = serialNumber;
		this.department = department;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

public class Facade {
	public static ArrayList<EmployeeFacade> employees = new ArrayList<EmployeeFacade>();
	public static ArrayList<ComputerFacade> computers = new ArrayList<ComputerFacade>();
	
	static {
		employees.add(new EmployeeFacade("emp1", "Programming"));
		employees.add(new EmployeeFacade("emp2", "Secretary"));
		
		computers.add(new ComputerFacade(1234, "Programming"));
		computers.add(new ComputerFacade(4321, "Secretary"));
	}
	
	 
	public static void main(String[] args) {
		Panel panel = new CompanyFacade(employees, computers);
		
		EmployeeFacade emp = panel.findEmployeeByName("emp1");
		ComputerFacade cpu = panel.findComputerBySerialNumber(1234);
		
		System.out.println("Dep of employee : " + emp.getDepartment() + " - Dep of cpu : " + cpu.getDepartment());
	}
}
