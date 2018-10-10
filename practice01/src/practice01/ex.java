package practice01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {

		// 구구단
		gugudan();
		
		// 다이아몬드
		diamond();
		
		// 성적 파일 입출력.
		try {
			sungjeok_file();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
	}
	
	// 구구단 출력
	public static void gugudan() {
		
		// 구구단을 표현하기 위한 정수형 변수 2개 선언
		int iter1, iter2;
		
		// 1. 구구단을 가로로 표기
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
		
		// 2. 구구단을 세로로 표기		
		// 1차 단의 요소를 기준으로 표기하기 위한 for문.
		for (iter1 = 1; iter1 < 10; iter1++) {
			// 2차 단을 표기하기 위한 for문.
			for (iter2 = 2; iter2 < 10; iter2++) {
				System.out.printf("%2d X %2d = %2d\t", iter2, iter1, iter2*iter1);
			}
			System.out.println("");
		}
		
		// 출력은 아래와 같다.
		// 2*1=2  3*1=3 .... 9*1=9
		// 2*2=4  ...	...	 ...
		// ...	  ...	...	 ...
		// 2*9=18 ...	...	 ...
		
		System.out.println("");
		System.out.println("");
		
		// 3. 구구단 가로 표시 while
		// 단의 변수 초기화.
		iter1 = 2;
		
		// 1처 2~9까지 while문을 반복
		while(iter1 < 10) {	
			// 요소의 변수 초기화.
			iter2 = 1;
			
			//2차 1~9 까지 while문을 반복.
			while (iter2 < 10) {
				// X*X=X를 표시
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
				
				// 다음 요소를 위한 증가
				iter2++;
			}
			// 단의 증가
			iter1++;
			
			//줄바꿈
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
		
		// 4. 구구단 가로표시 do while
		// 단의 변수 초기화.
		iter1 = 2;
		// 1차 do while 문 시작.
		do {
			// 요소의 변수 초기화.
			iter2 = 1;
			
			// 2차 do while 문 시작.
			do {
				// 구구단 표기.
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
				
				// 다음 요소를 위한 증가.
				iter2++;
			} while (iter2 < 10);
			// 요소의 값을 확인(9까지 표시 하였는가?)
			
			// 단의 증가.
			iter1++;
			
			// 줄바꿈
			System.out.println("");

		}while(iter1 < 10);
		// 단의 값 확인(9단까지 표시하였는가?)
		
		System.out.println("");
		System.out.println("");		
	}
	
	// 다이아몬드 출력
	public static void diamond() {
		
		// 다이아몬드 출력을 위한 변수 선언.
		int iter3, iter4, iter5, iter6;
		
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
		
		
		// 다이아몬드 표시를 while로 구현.
		
		// 윗부분 표시를 위한 줄표현 변수를 초기화.
		iter3 = 0;
		
		// 줄바꿈을 위한 while 문 - 윗 부분 표시.
		while (iter3 < 5) {
			
			// 공백 표시를 위한 초기화.
			iter4 = 4 - iter3;
			
			// 공백 표시
			while (iter4 > 0) {
				System.out.printf(" ");
				iter4--;
			}
			
			// 앞쪽 * 표시를 위한 초기화 
			iter5 = iter3; 
			
			while (iter5 >= 0) {
				System.out.printf("*");
				iter5--;
			}
			
			// 뒷쪽 * 표시를 위한 초기화.
			iter6 = 0;
			
			while(iter6 < iter3) {
				System.out.printf("*");
				iter6++;
			}
			
			// 줄바꿈.
			System.out.println();
			
			// 다음줄로 이동.
			iter3++;
		}
		
		//아래부분 표시를 위한 변수 초기화.
		iter3 = 1;
		
		// 줄바꿈을 위한 while문 - 아래 부분 표시.
		while (iter3 < 5) {

			// 공백 표시를 위한 초기화.
			iter4 = 0;
			
			while (iter4 < iter3) {
				System.out.printf(" ");
				iter4++;
			}
			
			// 앞쪽 * 표시를 위한 초기화
			iter5 = 5; 
			
			while (iter5 > iter3) {
				System.out.printf("*");
				iter5--;
			}
			
			// 뒤쪽 * 표시를 위한 초기화
			iter6 = 4;
			
			while(iter6 > iter3) {
				System.out.printf("*");
				iter6--;
			}
			System.out.println();
			iter3++;
		}
		System.out.println("");
		System.out.println("");
		

		// 다이아몬드 표시를 do while로 구현.

		// 윗부분 표시를 위한 줄표현 변수를 초기화.
		iter3 = 0;
		
		// 윗부분 줄바꿈을 위한 do while문 시작
		do {
			// 공백 표시를 위한 변수 초기화
			iter4 = 4 - iter3;
			
			// 공백표시 do while문 시작
			do {
				//마지막 줄에서 공백을 표시하지 않게 하기 위한 조건문.
				if (iter3 < 4)
					System.out.printf(" ");
				// 공백 표시용 변수 감소.
				iter4--;
			}while (iter4 > 0);
			// 공백 표시를 위한 do while 문 종료 조건.
			
			// 앞 쪽 * 표시를 위한 변수 초기화
			iter5 = iter3; 
			
			// 앞 쪽 * 표시를 위한 do while 문 시작.
			do {
				System.out.printf("*");
				
				// * 표시용 변수 값 감소
				iter5--;
			} while (iter5 >= 0);
			// 앞쪽 * 표시 종료 조건. 
			
			// 뒷쪽 * 표시를 위한 변수 초기화
			iter6 = 0;
			
			// 뒷쪽 * 표시를 위한 do while 문 시작
			do {
				// 첫 번째 라인 표시에서 *가 찍히지 않도록 하기 위한 조건문.
				// do whilw은 한번은 무조건 실행되기 때문에 조건문이 필요.
				if (iter3 != 0) {
					System.out.printf("*");
				}
				// 뒷 쪽 * 표시용 변수 값 증가.
				iter6++;
			} while(iter6 < iter3);
			// 뒷 쪽 * 표시 종료 조건.
			
			// 줄바꿈.
			System.out.println();
			
			// 다음 실행을 위한 변수값 증가.
			iter3++;
		}while (iter3 < 5);
		// 위 쪽 다이아몬드 표시 종료 조건.
		
		// 아래쪽 다이아몬드 표시
		// 줄바꿈용 변수 초기화.
		iter3 = 1;
		
		// 줄바꿈을 위한 do while 문 시작.
		do {
			// 앞 쪽 공백표시용 변수 초기화.
			iter4 = 0;
			
			// 공백 표시 do while문 시작.
			do {
				System.out.printf(" ");
				// 앞 쪽 공백표시용 변수 값 감소
				iter4++;
			} while (iter4 < iter3);
			// 공백 표시 do while문 종료조건.
			
			// 앞 쪽 * 표시용 변수 초기화 
			iter5 = 5; 
			
			// 앞 쪽 * 표시 do while문 시작
			do {
				System.out.printf("*");
				// 앞 쪽 * 표시용 변수 값 감소
				iter5--;
			} while (iter5 > iter3);
			// 앞 쪽 * 표시 do while문 종료 조건.
			
			// 뒷 쪽 * 표시용 변수 초기화.
			iter6 = 4;
			
			// 뒷 쪽 * 표시 do while 문 시작
			do {
				// 마지막 줄에서 *를 중복 표시하지 않기 위한 조건문.
				if( iter3 != 4) {
					System.out.printf("*");
				}
				// 쥣 쪽 * 표시용 변수 값 감소.
				iter6--;
			} while(iter6 > iter3);
			// 뒷 쪽 * 표시 do while문 종료 조건.
			
			// 줄바꿈.
			System.out.println();
			
			// 다음줄 표시를 위한 값 증가.
			iter3++;
		} while (iter3 < 5);
		// 줄 바꿈 do while문 종료 조건.
		
		System.out.println("");
		System.out.println("");
		
	}
	
	// 성적 최초 입력 받을 때 console에 표시하기 위한 함수.
	public static void sungjeok_print(String in) {
		
		// 함수 호출 시 가져온 parameter를 정수형 변수로 변환.
		int iTo = Integer.parseInt(in);
		
		System.out.println("");
		System.out.println("if문 출력 ");		
		System.out.println("");
		
		// 입력된 점수에 대한 성적을 출력하는 if 조건문.
		
		// 점수가 91점 이상인 경우 출력 
		if ( iTo > 90) {
			System.out.println("성적은 A입니다.");
		}
		// 점수가 81점 이상인 경우 출력
		else if (iTo > 80) {
			System.out.println("성적은 B입니다");
		}
		// 점수가 71점 이상인 경우 출력
		else if (iTo > 70) {
			System.out.println("성적은 C입니다");
		}
		// 점수가 61점 이상인 경우 출력
		else if (iTo > 60) {
			System.out.println("성적은 D입니다.");
		}
		// 점수가 60점 이하인 경우 출력.
		else {
			System.out.println("성적은 F입니다.");
		}
		
		System.out.println("");
		System.out.println("switch case문 출력 ");		
		System.out.println("");
		
		// 입력된 점수에 대한 성적 출력하는 switch 문.
		switch(iTo) {
		case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : case 94 : case 93 : case 92 : case 91 : 
			System.out.println("성적은 A입니다.");
			break;
		case 90 : case 89 : case 88 : case 87 : case 86 : case 85 : case 84 : case 83 : case 82 : case 81 : 
			System.out.println("성적은 B입니다.");
			break;
		case 80 : case 79 : case 78 : case 77 : case 76 : case 75 : case 74 : case 73 : case 72 : case 71 : 
			System.out.println("성적은 C입니다.");
			break;
		case 70 : case 69 : case 68 : case 67 : case 66 : case 65 : case 64 : case 63 : case 62 : case 61 : 
			System.out.println("성적은 D입니다.");
			break;
		default :
			System.out.println("성적은 F입니다.");
			break;
		}
	}
	
	// 성적을 5개 입력 받아 파일에 저장 하고 그것을 다시 불러와서 화면에 성적을 표시하는 함수.
	public static void sungjeok_file() throws IOException {
		
		// 점수 입력의 안내를 위한 출력.		
		System.out.println("점수 5개 입력");
		
		// 시스템에 입력을 하기 위한 변수 선언.
		Scanner input = new Scanner(System.in);
		
		// 입력 받은 횟수
		int iter = 1;
		// 파일에서 값을 불러올때 정수로 변환시 값을 받을 변수.
		int iScore; 
		// 파일에 저장하기 위한 문자열 변수
		String sIn;
		// 파일에서 값을 불러 가지고 있을 문자열 변수.
		String sOut;
		
		// 파일 관련 변수 선언 및 파일 이름 선언.
		File file = new File("test1.txt");
		
		// 파일에 저장하기 위한 객체 선언.
        FileWriter writer = null;		

        // 파일에 저장하기 위한 객체에 저장 위치 파일 관련 변수를 넣음.
        writer = new FileWriter(file, false);
        
        // 성적을 입력 받기 위한 반복문.
		while (iter < 6) {
			// 성적 입력이 몇번째 인지 알려주기 위한 출력문.
			System.out.printf("성적입력 %d : ", iter);
			// 입력된 데이터를 문자열로 가져옴.
			sIn = input.nextLine();
			// 입력 받은 데이터에 줄바꿈 문자를 추가하여 버퍼에 쓰기. 
			writer.write(sIn +"\r\n");
			// 버퍼를 비우고 파일에 쓰기.
	        writer.flush();
	        
	        // 첫번째 점수 입력시 성적 출력.
	        if (iter == 1) {
	        	sungjeok_print(sIn);
	        }
	        
	        // 다음 성적을 받거나 while문을 빠져나가기 위한 변수 값 증가.
	        iter++;	        
		}
		
		System.out.println("파일닫기");
		writer.close();
		
		// 파일에서 값을 읽어오기 위한 객체 선언.
		BufferedReader bReader = null;
		
		System.out.println("\n 성적 파일 열기 ");
		// 파일 객체를 파일읽기 객체에서 생성한것을 다시 버퍼에서 읽어올수 있도록 할당.
        bReader = new BufferedReader(new FileReader(file));
        
        // 파일에서 더이상 읽어올 수 없을 때까지 반복.
        while((sOut = bReader.readLine()) != null) {
        	// 버퍼에서 읽어온 문자열을 console에 출력.
            System.out.printf("%s : ", sOut);
            
            // 성적을 숫자료 변환.
            iScore = Integer.parseInt(sOut);
            
            // 성적에 맞는 조건문을 실행.
            if ( iScore > 90) {
    			System.out.println("성적은 A입니다.");
    		}
    		else if (iScore > 80) {
    			System.out.println("성적은 B입니다");
    		}
    		else if (iScore > 70) {
    			System.out.println("성적은 C입니다");
    		}
    		else if (iScore > 60) {
    			System.out.println("성적은 D입니다.");
    		}
    		else {
    			System.out.println("성적은 F입니다.");
    		}
        }
        
        // 파일을 다 읽어왓으면 bufferedreader, filereader를 닫음.        
        bReader.close();   
	}

}

