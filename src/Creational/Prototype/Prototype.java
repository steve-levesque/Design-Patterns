package Creational.Prototype;

import java.util.ArrayList;
import java.util.Random;

interface Employee {
	Employee clone();
	String getName();
}

class Secretary implements Employee {
	private String name;
	
	Secretary(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		return new Secretary("secretary clone-"+ new Random().nextInt());
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}


class Clerk implements Employee {
	private String name;
	
	Clerk(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		return new Clerk("clerk clone-"+ new Random().nextInt());
	}

	@Override
	public String getName() {
		return this.name;
	}
}

public class Prototype {
	static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	static {
		employees.add(new Secretary("prototype secretary"));
		employees.add(new Clerk("prototype clerk"));
	}
	
	
	public static void main(String[] args) {		
		System.out.println(employees.get(0).getName());
		
		for (int i = 0; i <= 10; i++)
			System.out.println(employees.get(0).clone().getName());
	}
}
