/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;

class Inspector implements Visitor {

	@Override
	public void visitProgrammer(Programmer programmer) {
		if (programmer.getWorkHours() < 20)
			System.out.println("Work more on the projects.");
	}

	@Override
	public void visitSecretary(Secretary secretary) {
		if (secretary.getWorkHours() > 40)
			System.out.println("Switch off with a coworker.");
	}
}
