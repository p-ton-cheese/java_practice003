package practice02;

import java.io.IOException;

public class ex1 {

	public static void main(String[] args) {
		
		gugudan p1 = new gugudan();
		
		diamond p2 = new diamond();
		
		sungjeock p3 = new sungjeock();
		
		p1.print2console();
		p2.print2console();
		
		try {
			p3.print2console();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 읽고 쓰는중에 에러");
		}
	}

}
