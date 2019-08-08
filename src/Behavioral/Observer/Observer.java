package Behavioral.Observer;

import java.util.HashMap;

class Card {
	private String name;
	private Boolean complete;
	
	Card(String name) {
		this.name = name;
		this.complete = false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
}

class TaskBoard {
	private Notification event;
	private Card card;
	
	TaskBoard() {
		this.event = new Notification();
	}
	
	public void createCard(String name) {
		card = new Card(name);
		event.notifyBoard("create", name);
	}
	
	public void finishCard() {
		card.setComplete(true);
		event.notifyBoard("finish", card.getName());
	}

	public Notification getEvent() {
		return event;
	}

	public void setEvent(Notification event) {
		this.event = event;
	}
}

class Notification {
	private HashMap<String, Event> listeners;
	
	Notification() {
		listeners = new HashMap<String, Event>();
	}
	
	public void active(String eventInfo, Event event) {
		listeners.put(eventInfo, event);
	}
	
	public void inactive(String eventInfo, Event event) {
		listeners.remove(eventInfo, event);
	}
	
	public void notifyBoard(String eventInfo, String eventMessage) {
		int counter = 0;
		for (HashMap.Entry<String, Event> listener : listeners.entrySet()) {
			counter++;
			String key = listener.getKey();
			Event value = listener.getValue();
			if (listener.getKey() == key) {
				value.update(eventMessage);
			}
		}
	}
}

interface Event {
	void update(String eventMessage);
}

class TextAlert implements Event {
	private String message;
	
	TextAlert(String message) {
		this.message = message;
	}
	
	@Override
	public void update(String eventMessage) {
		System.out.println("Text : " + message + eventMessage);
	}
	
}

class EmailAlert implements Event {
	private String message;
	
	EmailAlert(String message) {
		this.message = message;
	}
	
	@Override
	public void update(String eventMessage) {
		System.out.println("Email : " + message + eventMessage);
	}
	
}

public class Observer {
	public static void main(String[] args) {
		TaskBoard board = new TaskBoard();
		
		Event textAlert = new TextAlert("The card alert is in text format for creation of ");
		Event emailAlert = new EmailAlert("The card alert is in email format for creation of ");
		
		board.getEvent().active("create1", textAlert);
		board.createCard("Test");
		
		board.getEvent().active("create2", emailAlert);
		
		board.createCard("Tests");
	}
}
