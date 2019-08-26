/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;
// The momento keeps a copy of his originator and trigger the setter
// with its encapsulated values.

abstract class Momento {
	protected String title, text;
	protected int version;
	
	Momento(String title, String text, int version) {
		this.title = title;
		this.text = text;
		this.version = version;
	}
	
	public void content() {
		System.out.println("Title : " +title+ " - Content : " +text+ " - Version : " +version);
	}
	
	abstract void restore();
}
