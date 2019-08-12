/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Command;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Calendar> calendar = new ArrayList<Calendar>();
	
	public static void addAppointments() {
		calendar.add(new Evening());
		calendar.add(new Day());
		calendar.add(new Night());
		System.out.println("Appointments added to the calendar.");
	}
	
	public static void showAppointments() {
		System.out.println("Showing appointments in the calendar...");
		calendar.forEach((n) -> n.Appointment()); 
	}

	public static void main(String[] args) {
		addAppointments();
		showAppointments();
	}
}
