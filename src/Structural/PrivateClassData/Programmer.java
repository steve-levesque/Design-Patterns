/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;

class Programmer implements Employee {
	private Data data;
	
	Programmer() {
		data = new Data();
		data.setName("Programmer1");
	}
	
	public String getName() {
		return data.getName();
	}
}
