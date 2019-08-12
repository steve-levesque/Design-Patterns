/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Bridge;

class SecretaryField extends HumanRessource {

	SecretaryField(String name, Work work) {
		super(name, work);
	}

	@Override
	void doWork() {
		System.out.print("SecretaryField's work is to");
		work.doWork();
	}
}
