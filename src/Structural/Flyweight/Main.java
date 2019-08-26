/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Flyweight;
// The flyweight suggests to reduce repetition by splitting object
// components into 2 categories : extrinsic and intrinsic. The intrinsic part is the shared
// data which is highly repeating and not changeable while the extrinsic part contains the
// object's data that is normally one of a kind and changing in its course of life.

// Pros :
// - Reduces duplication of code, data saving weight and memory use.
// Cons :
// - Increases coupling and code complexity.
// - If the data's fields are equally different from each of the objects available, the flyweight
//   won't be much effective since no reusable parts could be made.

class Main {
	public static void main(String[] args) {
		Project[] projects = {
			new Project(1234, "Project1", null),
			new Project(4321, "Project2", null)
		};
		
		FlyweightFactory factory = new FlyweightFactory(projects);
		
		factory.list();
		factory.add(new Project(1234, "Project1", "Steve"));
		factory.add(new Project(1, "New", "Someone"));
		factory.list();
	}
}
