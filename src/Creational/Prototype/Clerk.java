/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Prototype;

import java.util.Random;

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