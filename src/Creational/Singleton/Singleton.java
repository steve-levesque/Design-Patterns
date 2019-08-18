/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Singleton;

class Company {
    private String ceoName;
    private static Company instance = null; 
	
    // Private constructor to prevent creation of a new object since it's the
    // contructor's default behavior by design towards object creation.
	private Company() {}
	
	// Static method used instead to make the evaluation possible.
	public static Company addCEO(String ceoName) {
		if (instance == null)  {
			instance = new Company(); 
			instance.ceoName = ceoName;
			System.out.println("No CEO in the company, "+ceoName+" is now the CEO.");
		}
		else {
			System.out.println(ceoName+" can't be the CEO since "+ instance.ceoName + " is already occuping the post.");
		}
  
        return instance; 
	}
    
	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
}
