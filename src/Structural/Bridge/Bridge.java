package Structural.Bridge;

import java.util.ArrayList;

/**
 *     
 * 
 *
 */

interface Work {
	void doWork();
}

class EnteryPay implements Work {

	@Override
	public void doWork() {
		System.out.println(" enter the pay of the employees.");
	}
	
}

class ClientService implements Work {

	@Override
	public void doWork() {
		System.out.println(" help clients with client service.");
	}
	
}

class Booking implements Work {

	@Override
	public void doWork() {
		System.out.println(" help schedules the meetings.");
	}
	
}

abstract class HumanRessource {
	private String name;
	protected Work work;
	
	HumanRessource(String name, Work work) {
		this.name = name;
		this.work = work;
	}
	
	abstract void doWork();
}

class SecretaryField extends HumanRessource {

	SecretaryField(String name, Work work) {
		super(name, work);
	}

	@Override
	void doWork() {
		System.out.print("SecretaryField's work is to");
		work.doWork();
	}
}

class SecretaryOffice extends HumanRessource {

	SecretaryOffice(String name, Work work) {
		super(name, work);
	}

	@Override
	void doWork() {
		System.out.print("SecretaryOffice's work is to");
		work.doWork();
	}
}

public class Bridge {
	public static void main(String[] args) {
		HumanRessource sec1 = new SecretaryField("Someone", new EnteryPay());
		sec1.doWork();
		
		HumanRessource sec2 = new SecretaryField("Someone else", new ClientService());
		sec2.doWork();
		
		HumanRessource sec3 = new SecretaryField("Someone abc", new Booking());
		sec3.doWork();
	}
}
