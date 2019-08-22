/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Composite;

import java.util.ArrayList;

class Directory implements Content {
	private String name;
    private ArrayList<Content> files = new ArrayList<Content>();
    
    Directory(String name) {
    	this.name = name;
    }
    
    public void add(Content object) {
    	files.add(object);
    }

	@Override
	public void display(int counter) {
		System.out.println(counter+"--|"+name+"|--");
		counter++;
		for (Content file : files) {
			Content result = file;
			result.display(counter);
		}
	}
}
