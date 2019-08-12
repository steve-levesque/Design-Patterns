/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;

class ReportField implements Report {

	@Override
	public void content() {
		System.out.println("Report made outside of the company.");
	}
	
}
