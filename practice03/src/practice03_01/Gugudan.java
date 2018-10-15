package practice03_01;

public class Gugudan {

	public void print2console() {
		// 구구단을 표현하기 위한 정수형 변수 2개 선언
		int iter1, iter2;
		
		System.out.println("");
		System.out.println("구구단");
		System.out.println("");
		
		// 구구단을 가로로 표기
		// 1차 단인 2~9단까지 표기하기 휘한 for문 
		for (iter1 = 2; iter1 < 10; iter1++) {
			// 2차 단의 요소 1~9까지 표기하기 위한 for문
			for (iter2 = 1; iter2 < 10; iter2++) {
				// X * X = X 를 console에 표기 하기 위한 print. 
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);				
			}
			// 줄바꿈을 하기 위한 println.
			System.out.println("");
		}
		
		// 출력은 아래와 같다.
		// 2*1=2 2*2=4 .... 2*9=18
		// 3단
		// ...
		// 9단 
		
		System.out.println("");
		System.out.println("");
	}
}