package Creational.AbstractFactory;

class ProgrammerReportField implements ReportField {

	@Override
	public void content() {
		System.out.println("Report of programmer outside the company.");
	}
	
}
