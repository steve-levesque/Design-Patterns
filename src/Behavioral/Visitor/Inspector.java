/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;
// All methods are implemented in the visitor class instead of the actual class.

class Inspector implements Visitor {

	@Override
	public void visit(Programmer programmer) {
		if (programmer.getWorkHours() < 20)
			System.out.println("Work more on the projects.");
	}

	@Override
	public void visit(Secretary secretary) {
		if (secretary.getWorkHours() > 40)
			System.out.println("Switch off with a coworker.");
	}
}
