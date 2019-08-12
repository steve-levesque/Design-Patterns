/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Strategy;

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