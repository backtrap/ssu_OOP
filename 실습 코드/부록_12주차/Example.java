public class Example {
	public void performAction() {
		int x = 10;
		int y = 20;

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("x + y = " + (x + y));
			}
		};

		x = 30;
		runnable.run();
	}
}
