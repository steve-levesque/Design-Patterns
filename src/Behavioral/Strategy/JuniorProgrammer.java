/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Strategy;

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