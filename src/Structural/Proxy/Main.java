/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Proxy;
// The proxy suggests to delegate some of the work, before or after the contact with the main class
// to the proxy class. Both should implement the same interface to avoid distinction from
// the application. 

// Pros :
// - The application doesn't know about which one between the main class and
//   the proxy class is used.
// Cons :
// - If the behavior from the proxy is relatively simple, its whole implementation
//   could be more difficult than just adding an addition to the main class.

class Main {
	public static void main(String[] args) {
		Manager system = new CompanySystem();
		Manager secretary = new SecretaryProxy(system, "Secretary1");
		
		// If the proxy isn't solicited, the main class does the work.
		system.sendMessage();
		secretary.sendMessage();
		
		// Else, the proxy will take care of it.
		secretary.setMessage("New message");
		secretary.sendMessage();
	}
}
