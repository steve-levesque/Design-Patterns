/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;
// Sub classes extended from this class have a constructor which take the stack (whatever the number of 
// items in it) and triggers the work of the wrapped class.

abstract class Decorator implements Graphic {
	// Wrapped class, the method would normally be triggered from it first.
	protected Graphic graphic;
	
	Decorator(Graphic graphic) {
		this.graphic = graphic;
	}
	
	public abstract void show();
	
}
