package j11_배열;

// 참조 자료형 => class, 배열
// String 자료형은 class => 주소값이 들어감
// null => 주소가 없다.
public class Array01 {

	public static void main(String[] args) {
		// 배열을 선언하는 2가지 방법
		
		// 1. 배열의 공간(크기)을 정해서 생성
		int[] numbers = new int[10]; // int 자료형 10개를 만들어 하나로 묶어놓은 자료형
		
		// 2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] character = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5]; 
		// String str = "test"; => 배열의 집합
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
		for(int i = 0; i  < numbers.length; i++) {
			System.out.println("i: "+ i );
			System.out.println("numbers: " + numbers[i]);
			System.out.println("numbers2: " + numbers2[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
	
	}

}
