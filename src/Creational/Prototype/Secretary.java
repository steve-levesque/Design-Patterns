/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Prototype;

import java.util.Random;

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
