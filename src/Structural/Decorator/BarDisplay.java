/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class BarDisplay extends Decorator {
	
	BarDisplay(Graphic graphic) {
		super(graphic);
	}

	@Override
	public void show() {
		graphic.show();
		System.out.println("Bar Charts:");
		System.out.println(" _  - _  -     - || ");
		System.out.println(" || - || -  _  - || ");
		System.out.println(" || - || -  || - || ");
	}
	
}
