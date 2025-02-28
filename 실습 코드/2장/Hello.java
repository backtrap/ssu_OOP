public class Hello {
    public int sum(int n, int m) {
        return n + m;
    }
    
    public static void main(String [] args) {
        Hello main = new Hello(); // Main 클래스의 인스턴스 생성
        int i = 20;
        int s;
        char a;
        
        s = main.sum(i, 10); // main 인스턴스를 통해 sum 메서드 호출
        a = '?';
        
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
