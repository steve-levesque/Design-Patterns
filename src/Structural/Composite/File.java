/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Composite;

class File implements Content { 
	private String name;
	
	File(String name) {
		this.name = name;
	}

	@Override
	public void display(int counter) {
		System.out.println(counter+"-"+name+"-");
	}
}
