/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;

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
