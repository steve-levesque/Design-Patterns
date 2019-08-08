package Behavioral.Visitor;

public class Main {
	public static void main(String[] args) {
		Visitor inspector = new Inspector();
		
		Employee secretary = new Secretary(45);
		Employee programmer = new Programmer(10);
		
		secretary.talkToInspector(inspector);
		programmer.talkToInspector(inspector);
	}
}
