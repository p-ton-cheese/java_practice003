package practice02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Sungjuk class 
public class Sungjuk {

	// 파일 읽기 메소드
	private void file2read() throws IOException {
		
		// 파일에서 받아오는 데이터 갯수를 파악하기 위한 변수.
		int iter;
		// 파일에서 값을 불러올때 정수로 변환시 값을 받을 변수.
		int iScore; 
		// 파일에서 값을 불러 가지고 있을 문자열 변수.
		String sOut;

		// 파일 관련 변수 선언 및 파일 이름 선언.
		File file = new File("test1.txt");
		
		// 파일에서 값을 읽어오기 위한 객체 선언.
		BufferedReader bReader = null;
		
		System.out.println("\n 성적 파일 열기 ");
		// 파일 객체를 파일읽기 객체에서 생성한것을 다시 버퍼에서 읽어올수 있도록 할당.
        bReader = new BufferedReader(new FileReader(file));
        
        // 파일에서 읽어온 점수 갯수 파악.
        iter = 1;
        
        // 파일에서 더이상 읽어올 수 없을 때까지 반복, 1개 라인씩 읽어옴.
        while((sOut = bReader.readLine()) != null) {
        	// 버퍼에서 읽어온 문자열을 console에 출력.
            System.out.printf("%s : ", sOut);
            
            // 성적을 숫자료 변환.
            iScore = Integer.parseInt(sOut);
            
            System.out.printf("파일에서 읽어온 %d번째 ", iter);
            
            // 성적에 맞는 조건문을 실행.
            grade(iScore);
            
            //다음 데이터를 위해 증가.
            iter++;
        }
        
        // 파일을 다 읽어왓으면 bufferedreader, filereader를 닫음.        
        bReader.close();  
	}

	// 파일에 저장하는 메소드.
	private void file2write(String strIn) throws IOException {
		
		// 파일 관련 변수 선언 및 파일 이름 선언.
		File file = new File("test1.txt");
		
		// 파일에 저장하기 위한 객체 선언.
        FileWriter writer = null;		

        // 파일에 저장하기 위한 객체에 저장 위치 파일 관련 변수를 넣음.
        writer = new FileWriter(file, false);
        
		// 입력 받은 데이터에 줄바꿈 문자를 추가하여 버퍼에 쓰기. 
		writer.write(strIn);
		
		// 버퍼를 비우고 파일에 쓰기.
	    writer.flush();

	    // 버퍼 닫기.
		writer.close();
		System.out.println("파일닫기");
	}
	
	// 점수를 학점으로 변경해서 console 창에 표현하는 메소드.
	private void grade(int iIn) {
		// 성적에 맞는 조건문을 실행.
        if ( iIn > 90) {
			System.out.println("성적은 A입니다.");
		}
		else if (iIn > 80) {
			System.out.println("성적은 B입니다");
		}
		else if (iIn > 70) {
			System.out.println("성적은 C입니다");
		}
		else if (iIn > 60) {
			System.out.println("성적은 D입니다.");
		}
		else {
			System.out.println("성적은 F입니다.");
		}
	}
	
	// 성적을 입력받는 메소드
	private String inSungjuk() {
		// 시스템에 입력을 하기 위한 변수 선언.
		Scanner input = new Scanner(System.in);
		
		// 입력 받은 횟수
		int iter = 1;
		// 파일에 저장하기 위한 문자열 변수
		String sIn = "";
				
		// 성적을 입력 받기 위한 반복문.
		while (iter < 6) {
			// 성적 입력이 몇번째 인지 알려주기 위한 출력문.
			System.out.printf("성적입력 %d : ", iter);
			// 입력된 데이터를 문자열로 가져옴.
			sIn += input.nextLine() + "\r\n";
			// 입력 받은 데이터에 줄바꿈 문자를 추가하여 버퍼에 쓰기.

	        // 다음 성적을 받거나 while문을 빠져나가기 위한 변수 값 증가.
	        iter++;	        
		}
		
		// 파일에서 읽어온 모든 데이터를 return
		return sIn;
	}
	
	// 콘솔창에 성적을 입력 및 출력하는 메소드, 외부 접근 가능.
	public void print2console() {
		
		// 점수 입력의 안내를 위한 출력.		
		System.out.println("점수 5개 입력");
		
		// 성적 입력.
		String sIn = inSungjuk();
		
		try {
			//파일 쓰기.
			file2write(sIn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file2write error!!");
		}
		
		try {
			// 파일 읽기
			file2read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file2read error!!");
		}
		
	}
}