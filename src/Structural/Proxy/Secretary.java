/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Proxy;

class Secretary {
	private String name;
	private Boolean isFired = false;
	
	public void isNowFired() {
		this.setIsFired(true);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsFired() {
		return isFired;
	}

	public void setIsFired(Boolean isFired) {
		this.isFired = isFired;
	}	
}
