/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Flyweight;
// The factory class retains all the flyweight object and is in charge of using/saving them
// properly when normal objects are passed inside the methods.

import java.util.ArrayList;

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
		System.out.println("----------------------------------------");
		for (FlyweightObject fwProject : projects) {
			if (fwProject.getProjectState().getSerial() == project.getSerial()) {
				System.out.println("Flyweight stored, reusing intrinsic information.");
				fwProject.checkState(project);
				return;
			}
		}
		System.out.println("No Flywieght found, creating new item from extrinsic information.");
		project.setEmployeeName(null);
		projects.add(new FlyweightObject(project));
	}
}
