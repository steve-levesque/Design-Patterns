/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class Secretary implements Employee {

	@Override
	public ReportField fillReportField() {
		return new SecretaryReportField();
	}

	@Override
	public ReportOffice fillReportOffice() {
		return new SecretaryReportOffice();
	}

}
