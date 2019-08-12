/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Adapter;

public class Main {
	public static void main(String[] args) {
		// Before the adapter.
		System.out.println("Old input.");
		Programmer p = new Programmer();
		Experience pe = new Experience("College", 0, 1);
		p.input("Steve", pe.getEducation(), pe.getProjectCount());
		
		// Different parameters must be passed.
		Secretary s = new Secretary();
		Experience se = new Experience("Secondary School", 10, 0);
		s.input("Someone", se.getEducation(), se.getYearExperience());
		
		
		// After the implementation of the adapter.
		System.out.println("Adapter input");
		Employee ap = new InputAdapter(new Programmer());
		Employee as = new InputAdapter(new Secretary());
		
		ap.input("Steve", pe);
		as.input("Someone", se);
	}
}
