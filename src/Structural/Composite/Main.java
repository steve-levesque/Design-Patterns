/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Composite;
// The composite suggests to implement a common interface for all items included
// in the tree to successfully do the work without needing to know the full
// iteration levels or any other unknown details.

// Pros :
// - The work can be completed without having to think beforehand of the levels of iteration,
//   the type of the object or any other critical information.
// Cons :
// - The interface needs to be implemented in all participating sub classes, which can be complicated 
//   if there are too much differences between them.

class Main {
	public static void main(String[] args) {
		File f1 = new File("File1");
		File f2 = new File("File2");
		File f3 = new File("File3");
		File f4 = new File("File4");
		File f5 = new File("File5");
		File f6 = new File("File6");
		Directory d1 = new Directory("Dir1");
		Directory d2 = new Directory("Dir2");
		Directory d3 = new Directory("Dir3");
		
		d1.add(f1);
		d2.add(f2);
		d2.add(f3);
		d1.add(d2);
		d3.add(f4);
		d3.add(f5);
		d3.add(f6);
		d1.add(d3);
		
		// This methods will trigger independently of the class' nature and the tree's depth.
		d1.display(0);
	}
}
