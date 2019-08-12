/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;

class DraftReport extends Originator {

	@Override
	public DraftVersion createVersion() {
		return new DraftVersion(this, title, text, version);
	}
	
}
