package Behavioral.Iterator;

import java.util.ArrayList;

import Behavioral.Iterator.CompanyInformation.DisclosableInformation;

class CompanyInformation {
	private ArrayList<String> confidentialInformations = new ArrayList<String>();
	
	protected CompanyInformation() {
		confidentialInformations.add("not really a secret");
		confidentialInformations.add("secret1");
		confidentialInformations.add("secret2");
	}
	
	public class DisclosableInformation {
		private CompanyInformation companyInformation;
		
		public DisclosableInformation(CompanyInformation companyInformation) {
			this.companyInformation = companyInformation;
        }
		
		// Iterator forced methods on the array.
		public int count() {
			return companyInformation.confidentialInformations.size();
		}	
		
		public String first() {
			return companyInformation.confidentialInformations.get(0);
		}	
	}
	
	public DisclosableInformation initialize() {
		return new DisclosableInformation(this);
	}
}

public class Iterator {
	public static void main(String[] args) {
		// No possible data management.
		CompanyInformation ci = new CompanyInformation();
		
		// Forcing the use of the iterator.
		DisclosableInformation dci = new CompanyInformation().initialize();
		
		// Available iterations... 
		System.out.println(dci.count());
		System.out.println(dci.first());
	}
}