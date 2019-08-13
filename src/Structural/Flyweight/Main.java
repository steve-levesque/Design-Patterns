/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Flyweight;

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
