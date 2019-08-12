/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Momento;

class ProductionReport extends Originator {
	
	@Override
	public ProductionVersion createVersion() {
		return new ProductionVersion(this, title, text, version);
	}
}

