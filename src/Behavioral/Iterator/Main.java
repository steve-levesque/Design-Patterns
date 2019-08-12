/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Iterator;

import Behavioral.Iterator.CompanyInformation.InformationIterator;

public class Main {
	public static void main(String[] args) {
		// No possible data management.
		CompanyInformation ci = new CompanyInformation();
		
		// Forcing the use of the iterator.
		InformationIterator dci = new CompanyInformation().initialize();
		
		// Available iterations... 
		System.out.println(dci.count());
		System.out.println(dci.first());
	}
}
