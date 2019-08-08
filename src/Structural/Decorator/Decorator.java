package Structural.Decorator;

interface Graphic {
	void show();
}

class Metric implements Graphic {
	@Override
	public void show() {
		System.out.println("Primary Stats:");
		System.out.println("1% - 50% - 100% | 2000 clients");	
	}
}

class Wrapper implements Graphic {
	private Graphic[] options;
	
	Wrapper(Graphic[] options) {
		this.options = options;
	}
	
	@Override
	public void show() {		
		for (Graphic opt : options) {
			opt.show();
		}
	}
}

class BarDisplay implements Graphic {
	@Override
	public void show() {
		System.out.println("Bar Charts:");
		System.out.println(" _  - _  -     - || ");
		System.out.println(" || - || -  _  - || ");
		System.out.println(" || - || -  || - || ");
	}
}

class LineDisplay implements Graphic {

	@Override
	public void show() {
		System.out.println("Line Charts:");
		System.out.println(" _       | ");
		System.out.println(" ||__   |  ");
		System.out.println(" |   |_|   ");
	}
	
}

public class Decorator {
	
	public static void main(String[] args) {
		Graphic opt1 = new BarDisplay();
		Graphic opt2 = new LineDisplay();
		Graphic[] optArray = {opt1, opt2};
		
		Graphic core = new Metric();	
		Graphic wrapper = new Wrapper(optArray);
		
		core.show();
		wrapper.show();
	}
}
