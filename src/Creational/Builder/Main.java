package Creational.Builder;

class Main {
	public static void main(String[] args) {
		Director director = new Director();
		
		ComputerBuilder builder = new ComputerBuilder();
		
		// THe director only executes plans of construction.
		director.makeDesktopComputer(builder);
		director.makePortableGamingComputer(builder);
		
		// The precise builder is needed to get the object.
		builder.setRig("Plastic");
		Computer computer = builder.getProduct();
		System.out.println(computer.getMaterial());
	}
}
