package Structural.Flyweight;

import java.util.ArrayList;

class Project {
	private int serial;
	private String description;
	private String employeeName;
	
	public Project(int serial, String description, String employeeName) {
		this.serial = serial;
		this.description = description;
		this.employeeName = employeeName;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}

class FlyweightObject {
	private Project projectState;
	
	FlyweightObject(Project projectState) {
		this.projectState = projectState;
	}
	
	public Project getProjectState() {
		return projectState;
	}

	public void setProjectState(Project projectState) {
		this.projectState = projectState;
	}

	public void checkState(Project project) {
		System.out.println("(Intrinsic) Retained in FW : Project serial number : "+ projectState.getSerial() + " - Description : " + projectState.getDescription() + " - Employee : " + projectState.getEmployeeName());
		System.out.println("(Extrinsic) Unique : Project serial number : "+ project.getSerial() + " - Description : " + project.getDescription() + " - Employee : " + project.getEmployeeName());
	}
}

class FlyweightFactory {
	private ArrayList<FlyweightObject> projects = new ArrayList<FlyweightObject>();
	
	FlyweightFactory(Project[] objects) {
		for (Project obj : objects) {
			projects.add(new FlyweightObject(obj));
		}
	}
	
	public void list() {
		System.out.println("=============================================");
		System.out.println("Factory FW count : " + projects.size());
		System.out.println("Projects :");
		for (FlyweightObject fwProject : projects) {
			System.out.println(fwProject.getProjectState().getSerial() + " - " + fwProject.getProjectState().getDescription() + " - " + fwProject.getProjectState().getEmployeeName());
		}
		System.out.println("=============================================");
	}
	
	public void add(Project project) {
		int counter = 0;
		
		System.out.println("----------------------------------------");
		for (FlyweightObject fwProject : projects) {
			if (fwProject.getProjectState().getSerial() == project.getSerial()) {
				System.out.println("Flyweight stored, reusing intrinsic information.");
				fwProject.checkState(project);
				return;
			}
			counter++;
		}
		System.out.println("No Flywieght found, creating new item from extrinsic information.");
		project.setEmployeeName(null);
		projects.add(new FlyweightObject(project));
	}
}

public class Flyweight {
	
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
