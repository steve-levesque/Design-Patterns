/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Iterator;

import java.util.ArrayList;

public class CompanyInformation {
	private ArrayList<String> confidentialInformations = new ArrayList<String>();
	
	protected CompanyInformation() {
		confidentialInformations.add("not really a secret");
		confidentialInformations.add("secret1");
		confidentialInformations.add("secret2");
	}
	
	// Iterator created inside the data class to avoid potential leaks
	// possible with getters and setters.
	class InformationIterator {
		private CompanyInformation companyInformation;
		
		public InformationIterator(CompanyInformation companyInformation) {
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

	public InformationIterator initialize() {
		return new InformationIterator(this);
	}
}
