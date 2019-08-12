package Creational.Singleton;

class Company {
    private String ceoName;
    private static Company instance = null; 
	
	private Company() {}
	
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
