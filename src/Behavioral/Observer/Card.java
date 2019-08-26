/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;
// Part of the TaskBoard to trigger events.

class Card {
	private String name;
	private Boolean complete;
	
	Card(String name) {
		this.name = name;
		this.complete = false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
}
