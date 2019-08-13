/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class BarDisplay implements Graphic {
	
	@Override
	public void show() {
		System.out.println("Bar Charts:");
		System.out.println(" _  - _  -     - || ");
		System.out.println(" || - || -  _  - || ");
		System.out.println(" || - || -  || - || ");
	}
	
}
