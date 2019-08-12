/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class ProgrammerReportOffice implements ReportOffice {

	@Override
	public void content() {
		System.out.println("Report of programmer at the office.");
	}
	
}