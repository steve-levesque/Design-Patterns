/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

//Application specifing what kind of report to produce
//while ignoring the parameter's type (the factory - secretary, programmer, etc.);
class ReportProducer {
	private Employee factory;
	private ReportOffice report;
	
	ReportProducer(Employee factory) {
		this.factory = factory;
		this.report = factory.fillReportOffice();
	}
	
	public void reportInformation() {
		report.content();
	}
}
