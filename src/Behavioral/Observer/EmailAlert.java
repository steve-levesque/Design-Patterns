/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;

class EmailAlert implements Event {
	private String message;
	
	EmailAlert(String message) {
		this.message = message;
	}
	
	@Override
	public void update(String eventMessage) {
		System.out.println("Email : " + message + eventMessage);
	}
	
}