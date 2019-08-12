/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Observer;

class Main {
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
