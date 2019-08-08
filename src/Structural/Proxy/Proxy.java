package Structural.Proxy;

import java.util.ArrayList;

class SecretaryProxy {
	private String name;
	private Boolean isFired = false;
	
	public void isNowFired() {
		this.setIsFired(true);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsFired() {
		return isFired;
	}

	public void setIsFired(Boolean isFired) {
		this.isFired = isFired;
	}	
}

class CompanySystem {
	private ArrayList<SecretaryProxy> employees = new ArrayList<SecretaryProxy>();
	
	public CompanySystem() {}
	
	public void addEmployee(SecretaryProxy employee) {
		this.employees.add(employee);
	}
	
	public void isFiredFromSystem(SecretaryProxy secretary) {
		if (employees.contains(secretary)) {
			secretary.isNowFired();
		}
	}
}


public class Proxy {

	public static void main(String[] args) {
		CompanySystem company = new CompanySystem();
		SecretaryProxy secretary = new SecretaryProxy();
		company.addEmployee(secretary);
		secretary.setName("Someone");
		System.out.println(secretary.getIsFired());
		
		// Tell the employee that he is fired directly.
		secretary.isNowFired();
		
		System.out.println(secretary.getIsFired());
		secretary.setIsFired(false);
		System.out.println(secretary.getIsFired());
		
		// Use the proxy (the company system) to change the employee's state.
		company.isFiredFromSystem(secretary);
		System.out.println(secretary.getIsFired());
	}
}
