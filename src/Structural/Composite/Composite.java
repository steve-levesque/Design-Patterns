package Structural.Composite;

import java.util.ArrayList;

interface Content {
	void display(int counter);
}

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



public class Composite {
	
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
