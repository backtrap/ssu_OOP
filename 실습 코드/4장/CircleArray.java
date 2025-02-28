class Circle03 {
	int radius;

	public Circle03(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String [] args) {
		Circle03 [] c;
		c = new Circle03[5];

		for (int i = 0; i < 5; i++)
			c[i] = new Circle03(i);

		for (int i = 0; i < c.length; i++)
			System.out.println((int)(c[i].getArea()) + " " );
	}
}
