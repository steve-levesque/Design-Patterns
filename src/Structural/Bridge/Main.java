/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Bridge;

class Main {
	public static void main(String[] args) {
		HumanRessource sec1 = new SecretaryField("Someone", new EnteryPay());
		sec1.doWork();
		
		HumanRessource sec2 = new SecretaryField("Someone else", new ClientService());
		sec2.doWork();
		
		HumanRessource sec3 = new SecretaryField("Someone abc", new Booking());
		sec3.doWork();
	}
}
