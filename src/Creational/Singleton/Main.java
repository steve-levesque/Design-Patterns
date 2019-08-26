/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Creational.Singleton;
// The singleton suggests that a program that needs to reuse the same object a relatively high
// number of times should prevent any new initializations and give back the object in question.

// Pros : 
// - Save memory by reusing the same object instead of creating a new one for each operation.
// Cons : 
// - The constructor is locked as private and the object's initialization is forced to be made
//   with the help of a static method.

class Main {
    public static void main(String[] args) {
    	Company ceo1 = Company.addCEO("Steve");
    	Company ceo2 = Company.addCEO("Person X");
    	
    	System.out.println(ceo1.getCeoName());
    	System.out.println(ceo2.getCeoName());
	}
}
