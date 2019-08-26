/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class SecretaryReportField extends ReportField {

	@Override
	public void content() {
		System.out.println("Report of secretary outside the company.");
	}
	
}
