package Creational.Builder;

class Director {
	private Builder builder;
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void makeDesktopComputer(Builder builder) {
		builder.reset();
		builder.setRig("Metal");
		builder.setPortableControls(false);
		builder.setMotherboard("Basic");
		builder.setRam(8);
		builder.setHardDrive(2);
		builder.setNeon(false);
		builder.setWifiAdapter(false);
	}
	
	public void makePortableGamingComputer(Builder builder) {
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