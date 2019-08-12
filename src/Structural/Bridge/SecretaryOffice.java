/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Bridge;

class SecretaryOffice extends HumanRessource {

	SecretaryOffice(String name, Work work) {
		super(name, work);
	}

	@Override
	void doWork() {
		System.out.print("SecretaryOffice's work is to");
		work.doWork();
	}
}
