/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class Wrapper implements Graphic {
	private Graphic[] options;
	
	Wrapper(Graphic[] options) {
		this.options = options;
	}
	
	@Override
	public void show() {		
		for (Graphic opt : options) {
			opt.show();
		}
	}
	
}
