package Behavioral.Command;

import java.util.ArrayList;
// The command class is the one who really triggers the object's method(s).

public class Command {
	public ArrayList<Calendar> calendar;
	
	Command () {
		this.calendar = new ArrayList<Calendar>();
	}
	
	public void addAppointments(Calendar date) {
		calendar.add(date);
		System.out.println("Appointment added to the calendar.");
	}
	
	public void showAppointments() {
		System.out.println("Showing appointments in the calendar...");
		calendar.forEach((n) -> n.Appointment()); 
	}
}
