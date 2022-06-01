package j18_최상위클래스;

public class Main {
//	Object obj = t1;	// 업캐스팅 가능(상속 또는 구현이 되었다.)
	public static void main(String[] args) {
		Teacher t1 = new Teacher("전주홍", "웹개발");
		Teacher t2 = new Teacher("전주홍", "웹개발");
		
		System.out.println(t1);	// toString은 생략이 가능하다.
		System.out.println(t2);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode() == t2.hashCode());

	}
	


}
