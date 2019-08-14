/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;
// The momento suggests that creating a snapshot of an object must never unveil its own
// state publicly to another outsider object. Thus, this problem can be solved by letting the 
// report (Originator) create the snapshot version (Momento) inside itself. The secretary (Caretaker)
// would then have only access to state safe methods like backup (Originator) and restore (Momento)
// to trigger the interaction.

// Pros :
// - The Caretaker can't break the encapsulation and invade the state of both the Momento and the Originator since they can know
//   their state only between themselves.
// Cons :
// - A caretaker class is needed to keep the momento.

class Main {
	public static void main(String[] args) {
		Originator draftReport = new DraftReport();
		draftReport.setVariable("Old", "This is a old report", 1);
		draftReport.content();
		
		Secretary secretary = new Secretary();
		
		secretary.backup(draftReport);		
		draftReport.setVariable("Updated", "This report has a modification", 2);
		draftReport.content();
		secretary.versionContent();
		
		secretary.undo();
		draftReport.content();
	}
}
