/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Adapter;

class InputAdapter implements Employee {
	private Programmer programmer;
	private Secretary secretary;
	
	InputAdapter(Programmer programmer) {
		this.programmer = programmer;
	}
	
	InputAdapter(Secretary secretary) {
		this.secretary = secretary;
	}
	
	@Override
	public void input(String name, Experience experience) {
		if (programmer != null) {
			programmer.input(name, experience.getEducation(), experience.getProjectCount());
		}
		else {
			secretary.input(name, experience.getEducation(), experience.getYearExperience());
		}
	}
	
}
