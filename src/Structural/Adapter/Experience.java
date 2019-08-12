/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Adapter;

class Experience {
	private String education;
	private int yearExperience;
	private int projectCount;
	
	Experience(String education, int yearExperience, int projectCount) {
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
