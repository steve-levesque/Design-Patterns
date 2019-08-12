/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Strategy;

class Main {
	public static void main(String[] args) {
		Operation work = new Operation(new JuniorProgrammer(), 3);
		work.executeOperation();
		work.setEmployee(new Programmer());
		work.executeOperation();
		work.setEmployee(new SeniorProgrammer());
		work.executeOperation();
	}
}
