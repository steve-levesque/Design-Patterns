/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Proxy;

import java.util.ArrayList;

class CompanySystem {
	private ArrayList<Secretary> employees = new ArrayList<Secretary>();
	
	public CompanySystem() {}
	
	public void addEmployee(Secretary employee) {
		this.employees.add(employee);
	}
	
	public void isFiredFromSystem(Secretary secretary) {
		if (employees.contains(secretary)) {
			secretary.isNowFired();
		}
	}
}
