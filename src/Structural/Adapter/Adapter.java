package Structural.Adapter;

interface Employee {
	void input(String name, Experience experience);
}

class Experience {
	private String education;
	private int yearExperience;
	private int projectCount;
	
	Experience(String education, int yearExperience, int projectCount) {
		this.education = education;
		this.yearExperience = yearExperience;
		this.projectCount = projectCount;
	}
	
	public String getEducation() {
		return education;
	}
	
	public int getYearExperience() {
		return yearExperience;
	}
	
	public int getProjectCount() {
		return projectCount;
	}
}

class InputAdapter implements Employee {
	private Programmer programmer;
	private Secretary secretary;
	
	InputAdapter(Programmer programmer) {
		this.programmer = programmer;
	}
	
	InputAdapter(Secretary secretary) {
		this.secretary = secretary;
	}
	
	@Override
	public void input(String name, Experience experience) {
		if (programmer != null) {
			programmer.input(name, experience.getEducation(), experience.getProjectCount());
		}
		else {
			secretary.input(name, experience.getEducation(), experience.getYearExperience());
		}
	}
	
}

class Programmer {
	 public void input(String name, String education, int projectCount) {
        System.out.println("Programmer name : " +name+ " - Education : " + education + " - Projects : "+ projectCount);
    }
}

class Secretary {
	public void input(String name, String education, int yearExperience) {
        System.out.println("Secretary name : "+ name + " - Education : " + education + " - Experience : " + yearExperience + " year(s)");
    }
}

public class Adapter {
	
	public static void main(String[] args) {
		// Before the adapter.
		System.out.println("Old input.");
		Programmer p = new Programmer();
		Experience pe = new Experience("College", 0, 1);
		p.input("Steve", pe.getEducation(), pe.getProjectCount());
		
		// Different parameters must be passed.
		Secretary s = new Secretary();
		Experience se = new Experience("Secondary School", 10, 0);
		s.input("Someone", se.getEducation(), se.getYearExperience());
		
		
		// After the implementation of the adapter.
		System.out.println("Adapter input");
		Employee ap = new InputAdapter(new Programmer());
		Employee as = new InputAdapter(new Secretary());
		
		ap.input("Steve", pe);
		as.input("Someone", se);
	}
}
