class Shape02 {
	protected String name;
	
	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);
	}
}

public class Circle02 extends Shape02 {
	protected String name;

	@Override
	public void draw() {
		name = "Circle02";
		super.name = "Shape02";
		super.draw();
		System.out.println(name);
	}

	public static void main(String [] args) {
		Shape02 b = new Circle02();
		b.paint();
	}
}
