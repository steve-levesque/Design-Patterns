/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;
// The Caretaker manages the safe state methods and keeps all versions of
// momento for future backups. Normally, the only state changing method
// available to the caretaker is the setter from the originator.

class Secretary {
	private Momento version;
	
	public void backup(Originator report) {
		version = report.createVersion();
		System.out.println("Report backed up.");
	}
	
	public void undo() {
		if (version != null) {
			version.restore();
			System.out.println("Report restored from version.");
		}
	}
	
	public void versionContent() {
		System.out.println("Content from version managed by secretary.");
		version.content();
	}
}