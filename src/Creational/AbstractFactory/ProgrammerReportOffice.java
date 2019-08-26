/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class ProgrammerReportOffice extends ReportOffice {

	@Override
	public void content() {
		System.out.println("Report of programmer at the office.");
	}
	
}