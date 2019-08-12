/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Bridge;

class ClientService implements Work {

	@Override
	public void doWork() {
		System.out.println(" help clients with client service.");
	}
	
}
