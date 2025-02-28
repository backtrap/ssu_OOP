class A {
	public A() {
		System.out.println("생성자 A");
	}

	public A(int x) {
		System.out.println("매개변수 생성자 A. 기본 생성자가 아님.");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}

	public B(int x) {
		System.out.println("매개변수 생성자 B. 기본 생성자가 아님.");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자 C");
	}
}

public class ConstructorEx03 {
	public static void main(String [] args) {
		B b;
		b = new B();
		B bb;
		bb = new B(5);
	}
}
