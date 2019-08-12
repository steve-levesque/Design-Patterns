/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class Programmer implements Employee {

	@Override
	public ReportField fillReportField() {
		return new ProgrammerReportField();
	}

	@Override
	public ReportOffice fillReportOffice() {
		return new ProgrammerReportOffice();
	}
	
}
