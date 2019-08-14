/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;
//The originator can make the snapshot on its own to keep
//the state private from other objects (createVersion();). 

abstract class Originator {
	protected String title, text;
	protected int version;
	
	public void setVariable(String title, String text, int version) {
		this.title = title;
		this.text = text;
		this.version = version;
	}
	
	public void content() {
		System.out.println("Title : " +title+ " - Content : " +text+ " - Version : " +version);
	}
	
	abstract Momento createVersion();
}
