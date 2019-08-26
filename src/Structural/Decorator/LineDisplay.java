/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class LineDisplay extends Decorator {

	LineDisplay(Graphic graphic) {
		super(graphic);
	}

	@Override
	public void show() {
		graphic.show();
		System.out.println("Line Charts:");
		System.out.println(" _       | ");
		System.out.println(" ||__   |  ");
		System.out.println(" |   |_|   ");
	}
	
}
