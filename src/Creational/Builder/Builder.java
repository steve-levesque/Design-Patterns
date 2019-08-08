package Creational.Builder;

class ComputerB {
	// Simplified for example purpose.
	private String material;
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
}

interface BuilderInterface {
	void reset();
	void setRig(String material);
	void setPortableControls(Boolean apply);
	void setMotherboard(String type);
	void setRam(int gigabyte);
	void setHardDrive(int terabyte);
	void setNeon(Boolean apply);
	void setWifiAdapter(Boolean apply);
}

class ComputerBuilder implements BuilderInterface {
	private ComputerB computer;
	
	ComputerBuilder() {
		this.reset();
	}
	
	public void reset() {
		this.computer = new ComputerB();
	}

	@Override
	public void setRig(String material) {
		computer.setMaterial(material);
		System.out.println("Added rig made of "+material+".");
	}

	@Override
	public void setPortableControls(Boolean apply) {
		String result;
		if (apply)
			result = "Added portable screen, keyboard and mousepad to the rig.";
		else
			result = "Added ports to add office screen, keyboard and mouse to the rig.";
			
		System.out.println(result);
	}

	@Override
	public void setMotherboard(String type) {
		System.out.println("Added a motherboard of type "+type+".");
	}

	@Override
	public void setRam(int gigabyte) {
		System.out.println("Added a ram drive of "+gigabyte+"gigabytes.");
	}

	@Override
	public void setHardDrive(int terabyte) {
		System.out.println("Added a hard drive of "+terabyte+" terabytes.");
	}

	@Override
	public void setNeon(Boolean apply) {
		String result;
		if (apply)
			result = "Added color neons to the rig.";
		else
			result = "No modification added.";
			
		System.out.println(result);
	}

	@Override
	public void setWifiAdapter(Boolean apply) {
		String result;
		if (apply)
			result = "Added wifi adapter to the rig.";
		else
			result = "Added ethernet port to the rig.";
			
		System.out.println(result);
	}
	
	public ComputerB getProduct() {
		ComputerB product = this.computer;
		this.reset();
		return product;
	}
}

class Director {
	private BuilderInterface builder;
	
	public void setBuilder(BuilderInterface builder) {
		this.builder = builder;
	}
	
	public void makeDesktopComputer(BuilderInterface builder) {
		builder.reset();
		builder.setRig("Metal");
		builder.setPortableControls(false);
		builder.setMotherboard("Basic");
		builder.setRam(8);
		builder.setHardDrive(2);
		builder.setNeon(false);
		builder.setWifiAdapter(false);
	}
	
	public void makePortableGamingComputer(BuilderInterface builder) {
		builder.reset();
		builder.setRig("Aluminium");
		builder.setPortableControls(true);
		builder.setMotherboard("Gaming");
		builder.setRam(20);
		builder.setHardDrive(3);
		builder.setNeon(true);
		builder.setWifiAdapter(true);
	}
}

public class Builder {
	public static void main(String[] args) {
		Director director = new Director();
		
		ComputerBuilder builder = new ComputerBuilder();
		
		// THe director only executes plans of construction.
		director.makeDesktopComputer(builder);
		director.makePortableGamingComputer(builder);
		
		// The precise builder is needed to get the object.
		builder.setRig("Plastic");
		ComputerB computer = builder.getProduct();
		System.out.println(computer.getMaterial());
	}
}
