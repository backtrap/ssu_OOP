class OuterClass2 {
	static StaticNestedClass b = new StaticNestedClass();

	Inner Class c = new InnerClass();
	StaticNestedClass d = new StaticNestedClass();

	static void staticMethod() {
		StaticNestedClass f = new StaticNestedClass();
	}

	void instatncMethod() {
		InnerClass g = new InnerClass();
		StaticNestedClass h = new StaticNestedClass();
	}

	class InnerClass {}

	static class StaticNestedClass {}
}
