interface Interface {
	public void method();
}

public class AnonymousExample1 {
	private static void print(Interface obj) {
		obj.method();
	}

	public static void main(String [] args) {
		print(new Interface() {
			@Override
			public void method() {
				System.out.println("Interface Implementation");
			}
		});
	}
}
