/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Prototype;

import java.util.ArrayList;

public class Main {
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
