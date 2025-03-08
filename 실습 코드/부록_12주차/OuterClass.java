class OuterClass {
	static int staticField;
	int instanceField;

	static void staticMethod() {}
	void instanceMethod() {}

	class InnerClass {
		int nonStaticField;

		InnerClass() {}

		void nonStaticMethod() {}

		void method() {
			staticField = 1;
			instanceField = 1;
			OuterClass.this.instanceField = 2;

			staticMethod();
			instanceMethod();
			OuterClass.this.instanceMethod();
		}
	}

	static class StaticNestedClass {
		int nonStaticField;
		static int staticField;

		StaticNestedClass() {}
		
		void nonStaticMethod() {}

		static void staticMethod() {}

		void method() {
			staticField = 1;
			OuterClass.staticField = 1;

			staticMethod();
			OuterClass.staticMethod();
			instanceMethod();
		}
	}
}
