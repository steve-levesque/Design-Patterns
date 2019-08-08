package Creational.AbstractFactory;

interface EmployeeFactory {
	ReportField fillReportField();
	ReportOffice fillReportOffice();
}

class SecretaryFactory implements EmployeeFactory {

	@Override
	public ReportField fillReportField() {
		return new SecretaryReportField();
	}

	@Override
	public ReportOffice fillReportOffice() {
		return new SecretaryReportOffice();
	}

}

class ProgrammerFactory implements EmployeeFactory {

	@Override
	public ReportField fillReportField() {
		return new ProgrammerReportField();
	}

	@Override
	public ReportOffice fillReportOffice() {
		return new ProgrammerReportOffice();
	}
	
}

interface ReportField {
	void content();
}

class SecretaryReportField implements ReportField {

	@Override
	public void content() {
		System.out.println("Report of secretary outside the company.");
	}
	
}

class ProgrammerReportField implements ReportField {

	@Override
	public void content() {
		System.out.println("Report of programmer outside the company.");
	}
	
}

interface ReportOffice {
	void content();
}

class SecretaryReportOffice implements ReportOffice {

	@Override
	public void content() {
		System.out.println("Report of secretary at the office.");
	}
	
}

class ProgrammerReportOffice implements ReportOffice {

	@Override
	public void content() {
		System.out.println("Report of programmer at the office.");
	}
	
}

// Application specifing what kind of report to produce
// while ignoring the parameter's type (the factory - secretary, programmer, etc.);
class ReportProducer {
	private EmployeeFactory factory;
	private ReportOffice report;
	
	ReportProducer(EmployeeFactory factory) {
		this.factory = factory;
		this.report = factory.fillReportOffice();
	}
	
	public void reportInformation() {
		report.content();
	}
}

public class AbstractFactory {
	private static EmployeeFactory factory;
	
	public static void initialize(String employeeType) throws Exception {
		if (employeeType == "Secretary")
			factory = new SecretaryFactory();
		else if (employeeType == "Programmer")
			factory = new ProgrammerFactory();
		else
			throw new Exception("Employee not supported to provide reports.");
			
	}
	
	public static void main(String[] args) throws Exception {
		initialize("Programmer");
		
		// App class working with different factories.
		ReportProducer app = new ReportProducer(factory);
		app.reportInformation();
		
		initialize("Secretary");
		ReportProducer app2 = new ReportProducer(factory);
		app2.reportInformation();
	}
}
