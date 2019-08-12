/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;

class ProductionVersion extends Momento {
	private ProductionReport originator;
	
	ProductionVersion(ProductionReport originator, String title, String text, int version) {
		super(title, text, version);
		this.originator = originator;
	}
	
	@Override
	void restore() {
		originator.setVariable(title, text, version);
	}
}
