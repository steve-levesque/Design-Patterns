/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Builder;
// The builder suggests to move all the code that builds the object into a separate class,
// a builder, instead of doing it in its constructor. This avoids the initialization of
// objects with huge constructors which might actually use some of the parameters 1 time out of
// 100.

// Pros :
// - Reduces object construction needed parameters.
// - Removes the need of sub classes for each object variant.
// Cons :
// - Huge number of steps and different types of builders can result in the need of the director class.
// - The director is not meant to return objects.

class Main {
	public static void main(String[] args) {
		Director director = new Director();
		
		ComputerBuilder builder = new ComputerBuilder();
		
		// The director only executes plans of construction.
		director.makeDesktopComputer(builder);
		director.makePortableGamingComputer(builder);
		
		// The precise builder is needed to get the object.
		builder.setRig("Plastic");
		Computer computer = builder.getProduct();
		System.out.println(computer.getMaterial());
	}
}
