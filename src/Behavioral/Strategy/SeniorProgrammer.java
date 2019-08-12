/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Strategy;

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
