package practice02;

public class Diamond {
	
	public void print2console() {
		// 다이아몬드 출력을 위한 변수 선언.
		int iter3, iter4, iter5, iter6;
		
		System.out.println("");
		System.out.println("다이아몬드 출력");
		System.out.println("");
		
		// *표시로 다이아 몬드 모양 만들기.
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		// 모양을 표시하기 위해서 어떤 방법을 사용할지에 대한 고민 필요.
		// 맨 윗줄을 *를 기준으로 세로 구분 하여 뒤쪽에 * 가 추가로 찍히는 부분을 구분.
		// 가운데 공백이 없는 라인을 기준으로 위, 아래로 구분.
		
		// 1차 줄바꿈을 위한 for문 - 5번째 줄까지 표현
		for (iter3 = 0; iter3 < 5; iter3++) {
			// 2차 앞쪽의 공백을 표기하기 위한 for문 - 공백의 갯수가 4 ~ 0 으로 감소. 
			for (iter4 = 4 - iter3; iter4 > 0; iter4--) {
				System.out.printf(" ");
			}
			// 2차 * 모양을 표시하기 위한 for문 - 앞쪽 *의 갯수가 1 ~ 5 로 증가.
			for (iter5 = iter3; iter5 >= 0; iter5--) {
				System.out.printf("*");
			}
			// 2차 * 모양을 표기하기 위한 for문. - 뒤쪽 *의 갯수가 0 ~ 4 로 증가.
			for (iter6 = 0; iter6 < iter3; iter6++) {
				System.out.printf("*");
			}
			// 줄바꿈.
			System.out.println("");
		}
		
		// 1차 줄바꿈을 위한 for문. - 6 ~ 9번째 줄까지 표현
		for(iter3 = 1; iter3 < 5; iter3++) {
			// 2차 앞쪽의 공백을 표기하기 위한 for문. 공백의 갯수가 1 ~ 4으로 증가
			for (iter4 = 0; iter4 < iter3; iter4++) {
				System.out.printf(" ");
			}
			// 2차 * 모양을 표기하기 위한 for문. - 앞쪽 *의 갯수가 4 ~ 1로 감소.
			for (iter5 = 5; iter5 > iter3; iter5--) {
				System.out.printf("*");
			}
			// 2차 * 모양을 표기하기 위한 for문. - 뒤쪽 *의 갯수가 3 ~ 0 으로 감소.
			for (iter6 = 4; iter6 > iter3; iter6--) {
				System.out.printf("*");
			}
			// 줄바꿈.
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
	}
}
