/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Proxy;

class SecretaryProxy implements Manager {
	private String name;
	private String message;

	private Manager system;
	
	SecretaryProxy(Manager system, String name) {
		this.system = system;
		this.name = name;
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void sendMessage() {
		if (message != null) 
			System.out.println(name + " has a custom message : " + message);
		else 
			system.sendMessage();
	}
}
