/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Builder;
// this class replaces the exhaustive construction of the object.

class ComputerBuilder implements Builder {
	private Computer computer;
	
	ComputerBuilder() {
		this.reset();
	}
	
	public void reset() {
		this.computer = new Computer();
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
	
	public Computer getProduct() {
		Computer product = this.computer;
		this.reset();
		return product;
	}
}
