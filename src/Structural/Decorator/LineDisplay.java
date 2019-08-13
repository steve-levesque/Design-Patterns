/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class LineDisplay implements Graphic {

	@Override
	public void show() {
		System.out.println("Line Charts:");
		System.out.println(" _       | ");
		System.out.println(" ||__   |  ");
		System.out.println(" |   |_|   ");
	}
	
}
