/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Flyweight;

class Project {
	private int serial;
	private String description;
	private String employeeName;
	
	public Project(int serial, String description, String employeeName) {
		this.serial = serial;
		this.description = description;
		this.employeeName = employeeName;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
