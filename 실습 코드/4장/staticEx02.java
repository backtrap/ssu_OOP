class StaticSample {
	public int n;
	public static int m;
	
	public void g() {
		m = 20;
	}

	public void h() {
		m = 30;
	}

	public static void f() {
		m = 5;
	}
}

public class staticEx02 {
	public static void main(String [] args) {
		StaticSample.m = 10;
		System.out.println(StaticSample.m);

		StaticSample s1;
		s1 = new StaticSample();
		System.out.println(s1.m);
		
		s1.f();
		System.out.println(s1.m);
		
		s1.h();
		System.out.println(s1.m);

		StaticSample.f();
		System.out.println(s1.m);
	}
}

