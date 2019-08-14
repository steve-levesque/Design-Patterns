/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Iterator;
// The iterator suggests that an application collection's elements should never be iterated/accessed directly
// with the built-in methods by the user and that he should only have access to the abstracted iterator's methods.

// Pros :
// - Control the possible actions of the user on the collection.
// - Reduce coupling of algorithms and collections.
// Cons :
// - The more types of access you need, the more methods you need to write on the iterator. 

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
