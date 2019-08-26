/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class ProgrammerReportField extends ReportField {

	@Override
	public void content() {
		System.out.println("Report of programmer outside the company.");
	}
	
}
