package Creational.Singleton;

class Main {
    public static void main(String[] args) {
    	Company ceo1 = Company.addCEO("Steve");
    	Company ceo2 = Company.addCEO("Person X");
    	
    	System.out.println(ceo1.getCeoName());
    	System.out.println(ceo2.getCeoName());
	}
}
