/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;
// The observer suggests to implement an action capable of notifying interested observers
// about changes made and in many ways possible instead of sending the notification to all users. 

// Pros :
// - Notifications are sent to the right actors and the way they want it, since they only get the notification
//   if they subscribed on their own will.
// Cons :
// - Having a a lot of observing objects and many types of notifications will significantly raise complexity.

class Main {
	public static void main(String[] args) {
		// The application's notifier is instantiated from the constructor.
		TaskBoard board = new TaskBoard();
		
		// Event types used by the notifier.
		Event textAlert = new TextAlert("The card alert is in text format for creation of ");
		Event emailAlert = new EmailAlert("The card alert is in email format for creation of ");
		
		// Subscription to an event type.
		board.getEvent().active("create1", textAlert);
		
		// On method use, the notifier will notify from the subscribed event types.
		board.createCard("Text Event");
		board.getEvent().active("create2", emailAlert);
		board.createCard("Both types");
	}
}
