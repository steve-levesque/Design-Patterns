/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;
// Encapsulation of attributes and limitation of visibility.

class Data {
	private String name;
	
	Data(String name) { 
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
