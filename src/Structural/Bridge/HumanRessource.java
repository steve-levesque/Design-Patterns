/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Bridge;
// This class is elected as the main category, it contains the second category.

abstract class HumanRessource {
	private String name;
	protected Work work;
	
	HumanRessource(String name, Work work) {
		this.name = name;
		this.work = work;
	}
	
	abstract void doWork();
}
