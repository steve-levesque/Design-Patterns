package Creational.AbstractFactory;

class Main {
	private static Employee factory;
	
	static void initialize(String employeeType) throws Exception {
		if (employeeType == "Secretary")
			factory = new Secretary();
		else if (employeeType == "Programmer")
			factory = new Programmer();
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
