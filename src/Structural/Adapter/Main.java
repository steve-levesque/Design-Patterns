/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Adapter;
// The adapter suggests to wrap one or multiple objects which has complicated or unsupported
// operations between them with a class, an adapter, to simplify the work and bring together similarities. 

// Pros :
// - The old code doesn't need and even know the adapter implementation, it only receives what it needs.
// Cons : 
// - If the objects differences are relatively small, building a whole wrapper around a huge group of
//   objects might not be worth.

public class Main {
	public static void main(String[] args) {
		Input pe = new Input("College", 0, 1);
		Input se = new Input("Secondary School", 10, 0);
		
		Programmer p = new Programmer();
		Secretary s = new Secretary();
		
		// Those 2 objects doesn't use the Input in the same way.
		p.input("Steve", pe.getEducation(), pe.getProjectCount());
		s.input("Someone", se.getEducation(), se.getYearExperience());
		
		// An adapter would make the Input work perfectly with both objects.
		Employee ap = new InputAdapter(new Programmer());
		Employee as = new InputAdapter(new Secretary());
		
		ap.input("Steve", pe);
		as.input("Someone", se);
	}
}
