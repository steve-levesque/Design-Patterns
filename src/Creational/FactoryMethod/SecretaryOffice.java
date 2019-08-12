/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.FactoryMethod;

class SecretaryOffice extends Secretary {

	@Override
	public ReportOffice fillReport() {
		return new ReportOffice();
	}
	
}
