package Behavioral.Command;

import java.util.ArrayList;

interface Calendar {
	void Appointment();
}

class Evening implements Calendar {

	@Override
	public void Appointment() {
		System.out.println("Breakfast with friend1");
	}
	
}

class Day implements Calendar {

	@Override
	public void Appointment() {
		System.out.println("Dinner with friend2");
	}
	
}

class Night implements Calendar {

	@Override
	public void Appointment() {
		System.out.println("Supper with friend3");
	}
	
}

public class Command {
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
