/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Flyweight;
// Retained intrinsic object parts are saved in a flyweight object which
// is contained in the flyweight factory to evaluate the future operations. 

class FlyweightObject {
	private Project projectState;
	
	FlyweightObject(Project projectState) {
		this.projectState = projectState;
	}
	
	public Project getProjectState() {
		return projectState;
	}

	public void setProjectState(Project projectState) {
		this.projectState = projectState;
	}

	public void checkState(Project project) {
		System.out.println("(Intrinsic) Retained in FW : Project serial number : "+ projectState.getSerial() + " - Description : " + projectState.getDescription() + " - Employee : " + projectState.getEmployeeName());
		System.out.println("(Extrinsic) Unique : Project serial number : "+ project.getSerial() + " - Description : " + project.getDescription() + " - Employee : " + project.getEmployeeName());
	}
}
