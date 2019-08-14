/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Facade;

import java.util.ArrayList;

class Company implements Panel {
	private ArrayList<Employee> employees;
	private ArrayList<Computer> computers;
	
	Company(ArrayList<Employee> employees, ArrayList<Computer> computers) {
		this.employees = employees;
		this.computers = computers;
	}
	
	@Override
	public Employee findEmployeeByName(String name) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getName() == name) {
				return employees.get(i);
			}
		}
		return null;
	}

	@Override
	public Computer findComputerBySerialNumber(int number) {
		for (int i = 0; i < computers.size(); i++) {
			if (computers.get(i).getSerialNumber() == number) {
				return computers.get(i);
			}
		}
		return null;
	}
}
