/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;

class Main {
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
