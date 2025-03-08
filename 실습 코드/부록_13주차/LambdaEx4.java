interface MyFunction {
	int calc(int x, int y);
}

public final class LambdaEx4 {
	public static void main(String [] args) {
		printMultiply(3, 4, (x, y) -> x * y);
	}

	static void printMultiply(int x, int y, MyFunction f) {
		System.out.println(f.calc(x, y));
	}
}
