/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Builder;
// The object doesn't need to implement a huge constructor that would
// force the attribution of variables even if not necessary.

class Computer {
	// Simplified for example purpose.
	private String material;
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
}
