package Creational.FactoryMethod;

abstract class Secretary {
	abstract Report fillReport();
	
	public void report() {
		Report report = fillReport();
		report.content();
	}
}

class SecretaryField extends Secretary {

	@Override
	public ReportField fillReport() {
		return new ReportField();
	}
	
}

class SecretaryOffice extends Secretary {

	@Override
	public ReportOffice fillReport() {
		return new ReportOffice();
	}
	
}

interface Report {
	void content();
}

class ReportField implements Report {

	@Override
	public void content() {
		System.out.println("Report made outside of the company.");
	}
	
}

class ReportOffice implements Report {

	@Override
	public void content() {
		System.out.println("Report made at the office.");
	}
	
}

public class FactoryMethod {
	private static Secretary secretary;
	
	public static void initialize() throws Exception {
		String workplace = "Field";
				
		if (workplace == "Office")
			secretary = new SecretaryOffice();
		else if (workplace == "Field")
			secretary = new SecretaryField();
		else
			throw new Exception("Workplace not supported by the secretaries to provide reports.");
			
	}
	
	public static void main(String[] args) throws Exception {
		initialize();
		
		secretary.report();
	}
}
