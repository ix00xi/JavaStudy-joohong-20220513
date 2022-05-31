package j17_스태틱;

/*
 * 스태틱 
 * 복제x, 공유하는 기능, 생성하지 않아도 사용할 수 있다.
 * 변수와 메소드에 사용
 * 
 */

public class Main {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t1.method();
		t2.method();
		t3.method();
		
//		StaticTest st1 = new StaticTest();
//		StaticTest st2 = new StaticTest();
//		StaticTest st3 = new StaticTest();
//		
//		st1.count = 10;
//		st2.count = 20;
//		st3.count = 30;
//		
//		st1.staticMethod();
//		st2.staticMethod();
//		st3.staticMethod();
		
		StaticTest.count = 100;
		
		StaticTest.staticMethod();
		
		
		
	}

}
