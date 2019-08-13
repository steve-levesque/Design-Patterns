/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.PrivateClassData;

class Main {
	public static void main(String[] args) {
		Employee emp1 = new Programmer();
		Employee emp2 = new Secretary();
		
		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
	}
}
