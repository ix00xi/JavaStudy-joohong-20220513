package j06_반복;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i < 100) {	// while 안에 조건문을 넣는다. 참이 아닐때 반복이 멈춘다.
			result = result + (i + 1);
			i++; // 조건 변화 수식
			System.out.println(result);
		}

	}

}
