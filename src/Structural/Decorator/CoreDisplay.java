/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;
// The first class to be instantiated. It doesn't need a constructor since it's the starting point
// of the stack of decorators.

class CoreDisplay implements Graphic {

	@Override
	public void show() {
		System.out.println("Primary Stats:");
		System.out.println("1% - 50% - 100% | 2000 clients");
	}

}
