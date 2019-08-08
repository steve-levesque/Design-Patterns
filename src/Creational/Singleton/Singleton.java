package Creational.Singleton;

public final class Singleton {
    private String ceoName;
    private static Singleton instance = null; 
	
	private Singleton() {}
	
	public static Singleton addCEO(String ceoName) {
		if (instance == null)  {
			instance = new Singleton(); 
			instance.ceoName = ceoName;
		}
  
        return instance; 
	}
    
	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
    
    public static void main(String[] args) {
		Singleton ceo1 = Singleton.addCEO("Steve");
		Singleton ceo2 = Singleton.addCEO("Somoene");
    	
    	System.out.println(ceo1.getCeoName());
    	System.out.println(ceo2.getCeoName());
	}
}
