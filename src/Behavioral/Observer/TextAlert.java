/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;

class TextAlert implements Event {
	private String message;
	
	TextAlert(String message) {
		this.message = message;
	}
	
	@Override
	public void update(String eventMessage) {
		System.out.println("Text : " + message + eventMessage);
	}
	
}
