interface MyFunction {
	int calc(int x);
}

public class LambdaEx2 {
	public static void main(String [] args) {
		MyFunction square = x -> x * x;

		System.out.println(square.calc(2));
	}
}
