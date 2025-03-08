interface MyFunction {
	void print();
}

public class LambdaEx3 {
	public static void main(String [] args) {
		MyFunction f = () -> {
			System.out.println("Hello");
		};

		f.print();

		f = () -> System.out.println("안녕");

		f.print();
	}
}
