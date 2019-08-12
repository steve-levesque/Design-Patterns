/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;

abstract class Secretary {
	abstract Report fillReport();
	
	public void report() {
		Report report = fillReport();
		report.content();
	}
}
