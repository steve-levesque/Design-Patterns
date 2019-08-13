/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Composite;

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
		
		d1.display(0);
	}
}
