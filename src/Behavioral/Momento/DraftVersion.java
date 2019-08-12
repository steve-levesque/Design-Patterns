/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;

class DraftVersion extends Momento {
	private DraftReport originator;
	
	DraftVersion(DraftReport originator, String title, String text, int version) {
		super(title, text, version);
		this.originator = originator;
	}

	@Override
	void restore() {
		originator.setVariable(title, text, version);
	}
}