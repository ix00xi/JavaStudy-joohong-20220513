package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello, Java");
		System.out.println("Hello, Java");
		System.out.print("10 + 5");
		System.out.print(10 + 5);		
		System.out.println();
			
		int age = 29; // 변수 선언
		//age = 10; 앞에 선언한 변수는 다시 선언하지 않는다
		
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1;
		
		System.out.print("나이: ");
		System.out.println(age);
		
	}

}
