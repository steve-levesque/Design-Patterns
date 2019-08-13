/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Decorator;

class Metric implements Graphic {
	
	@Override
	public void show() {
		System.out.println("Primary Stats:");
		System.out.println("1% - 50% - 100% | 2000 clients");	
	}
	
}
