class SuperClass {
	int param;

	SuperClass() {
		this.param = 0;
	}

	SuperClass(int param) {
		this.param = param;
	}

	void method() {
		System.out.println("method in Super Class");
	}
}

public class AnonymousExample {
	private static void print(SuperClass obj) {
		obj.method();
	}

	public static void main(String [] args) {
		print(new SuperClass() {
			@Override
			void method() {
				System.out.println("method in Anonymous Class");
				System.out.println("param is " + super.param + ".");
			}
		});
	}
}
