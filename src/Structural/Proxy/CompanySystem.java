/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Proxy;

class CompanySystem implements Manager {
	private String message;
	
	public CompanySystem() {
		message = "Default message from system sent.";
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void sendMessage() {
		System.out.println(message);
	}
}
