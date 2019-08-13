/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;

public class Secretary implements Employee {
	private Data data;
	
	Secretary() {
		data = new Data();
		data.setName("Secretary1");
	}
	
	public String getName() {
		return data.getName();
	}
}
