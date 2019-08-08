package Structural.PrivateClassData;

class Data {
	private String name;
	private String profession;
	private int age;
	private int experience;
	
	Data(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
}

class MainClass {
	private Data data;
	
	MainClass() {
		data = new Data("From Data Class");
	}
	
	public String getName() {
		return data.getName();
	}
}

public class PrivateClassData {
	
	public static void main(String[] args) {
		MainClass data = new MainClass();
		System.out.println(data.getName());
	}
}
