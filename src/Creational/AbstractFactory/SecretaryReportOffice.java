/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class SecretaryReportOffice extends ReportOffice {

	@Override
	public void content() {
		System.out.println("Report of secretary at the office.");
	}
	
}