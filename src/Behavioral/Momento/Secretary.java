/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;

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