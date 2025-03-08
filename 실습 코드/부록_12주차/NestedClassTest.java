public class NestedClassTest {
	public static void main(String [] args) {
		OuterClass oc = new OuterClass();

		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.nonStaticField = 1;
		ic.nonStaticMethod();

		OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
		snc.nonStaticField = 1;
		snc.nonStaticMethod();
		OuterClass.StaticNestedClass.staticField = 1;
		OuterClass.StaticNestedClass.staticMethod();

		System.out.println(ic.nonStaticField);
		System.out.println(snc.nonStaticField);
	}
}
