public class a01 {
	int n1;
	int n2;
	
	public a01() {
		this(1, 2);

		System.out.println("생성자2 호출 완료");
	}

	public a01(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;

		System.out.println("생성자2 작업 완료");
	}

	public static void main(String [] args) {
		a01 a = new a01();
	}
}
