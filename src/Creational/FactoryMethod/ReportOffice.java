/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;

class ReportOffice implements Report {

	@Override
	public void content() {
		System.out.println("Report made at the office.");
	}
	
}
