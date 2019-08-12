/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;

class SecretaryField extends Secretary {

	@Override
	public ReportField fillReport() {
		return new ReportField();
	}
	
}
