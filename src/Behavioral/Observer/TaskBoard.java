/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer; 

class TaskBoard {
	private Notifier event;
	private Card card;
	
	TaskBoard() {
		this.event = new Notifier();
	}
	
	public void createCard(String name) {
		card = new Card(name);
		event.notifyBoard("create", name);
	}
	
	public void finishCard() {
		card.setComplete(true);
		event.notifyBoard("finish", card.getName());
	}

	public Notifier getEvent() {
		return event;
	}

	public void setEvent(Notifier event) {
		this.event = event;
	}
}
