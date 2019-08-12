package Creational.Builder;

interface Builder {
	void reset();
	void setRig(String material);
	void setPortableControls(Boolean apply);
	void setMotherboard(String type);
	void setRam(int gigabyte);
	void setHardDrive(int terabyte);
	void setNeon(Boolean apply);
	void setWifiAdapter(Boolean apply);
}
