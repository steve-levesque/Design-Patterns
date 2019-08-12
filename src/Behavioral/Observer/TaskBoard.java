/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;

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
