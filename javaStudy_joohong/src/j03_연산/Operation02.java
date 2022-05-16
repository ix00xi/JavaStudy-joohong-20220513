package j03_연산;


/*
 *  논리 연산자 
 *  
 *  And => &&	- 곱	
 *  => 모든 조건이 참 일때 True의 결과 
 *  => 하나라도 거짓이면 False의 결과
 * 
 *  Or	=> ||	- 합
 *  => 모든 조건이 거짓일때 False의 결과
 *  => 하나라도 참이면 True의 결과
 *  
 *  Not => !	- 부정
 *  => !(T && T) => False
 *  => !(F && F) => True
 *  
 *  0(False)
 *  !0(True)
 *  
 *  T(1) && T(1) => T(1)
 *  T(1) && F(0) => F(0)
 *  
 *  T(1) || T(1) => T(1)
 *  T(1) || F(0) => T(1)
 *  F(0) || F(0) => F(0)
 *  
 */

public class Operation02 {

	public static void main(String[] args) {
	int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		
		System.out.println("result1 AND result2:" + (result1 && result2));

	}

}
