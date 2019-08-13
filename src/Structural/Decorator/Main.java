/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class Main {
	public static void main(String[] args) {
		Graphic opt1 = new BarDisplay();
		Graphic opt2 = new LineDisplay();
		Graphic[] optArray = {opt1, opt2};
		
		Graphic core = new Metric();	
		Graphic wrapper = new Wrapper(optArray);
		
		core.show();
		wrapper.show();
	}
}
