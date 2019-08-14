/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Proxy;

class Main {
	public static void main(String[] args) {
		CompanySystem company = new CompanySystem();
		Secretary secretary = new Secretary();
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
