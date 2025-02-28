public class Circle02 {
	int radius;

	public Circle02(int radius) {
		this.radius = radius;
	}

	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String [] args) {
		Circle02 ob1 = new Circle02(1);
		Circle02 ob2 = new Circle02(2);
		Circle02 ob3 = new Circle02(3);

		System.out.printf("ob1의 반지름은 %d\n", ob1.radius);
		System.out.printf("ob2의 반지름은 %d\n", ob2.radius);
		System.out.printf("ob3의 반지름은 %d\n", ob3.radius);

		ob1.set(4);
		ob2.set(5);
		ob3.set(6);

		System.out.printf("ob1의 반지름은 %d\n", ob1.radius);
		System.out.printf("ob2의 반지름은 %d\n", ob2.radius);
		System.out.printf("ob3의 반지름은 %d\n", ob3.radius);
	}
}


