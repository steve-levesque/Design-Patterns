package Creational.AbstractFactory;

class SecretaryReportOffice implements ReportOffice {

	@Override
	public void content() {
		System.out.println("Report of secretary at the office.");
	}
	
}