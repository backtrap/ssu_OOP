class AClass {
	static int staticField;
	int instanceField;

	static void staticMethod() {}

	void instanceMethod() {}

	void method() {
		class LocalClass {
			int nonStaticField;

			LocalClass() {}

			void nonStaticMethod() {}

			void method() {
				staticField = 1;
				instanceField = 1;
				AClass.this.instanceField = 1;
				
				staticMethod();
				instanceMethod();
				AClass.this.instanceMethod();
			}
		}

		LocalClass Ic = new LocalClass();
		Ic.nonStaticField = 1;
		Ic.nonStaticMethod();
	}

	void method(final int arg) {
		int localVariable = 0;

		class LocalClass {
			void method() {
				int a = arg;
				int b = localVariable;
			}
		}
	}

	AnInterface method(double a) { // 원래는 매개변수가 void이나, 이미 정의되어 있으므로 매개변수로 double a를 받도록 임의로 수정함.
		class LocalClass implements AnInterface {
			public void method() {}
		}

		return new LocalClass();
	}
}

interface AnInterface {
	public void method();
}
