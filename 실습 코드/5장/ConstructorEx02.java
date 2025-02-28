class A {
	public A() {
		System.out.println("생성자 A");
	}

	public A(int x) {
		System.out.println("기본 생성자가 아님.");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자 C");
	}
}

public class ConstructorEx02 {
	public static void main(String [] args) {
		B b;
		b = new B();
	}
}
