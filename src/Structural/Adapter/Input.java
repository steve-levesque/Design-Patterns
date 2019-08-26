/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Adapter;

class Input {
	private String education;
	private int yearExperience;
	private int projectCount;
	
	Input(String education, int yearExperience, int projectCount) {
		this.education = education;
		this.yearExperience = yearExperience;
		this.projectCount = projectCount;
	}
	
	public String getEducation() {
		return education;
	}
	
	public int getYearExperience() {
		return yearExperience;
	}
	
	public int getProjectCount() {
		return projectCount;
	}
}
