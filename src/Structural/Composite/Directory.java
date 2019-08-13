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
    private ArrayList<Object> files = new ArrayList<Object>();
    
    Directory(String name) {
    	this.name = name;
    }
    
    public void add(Object object) {
    	files.add(object);
    }

	@Override
	public void display(int counter) {
		System.out.println(counter+"--|"+name+"|--");
		counter++;
		for (Object file : files) {
			Content result = (Content) file;
			result.display(counter);
		}
		
	}
}
