package practice02;

public class Practice1 {

	public static void main(String[] args) {
		// Class Gugudan 객체 p1 생성
		Gugudan p1 = new Gugudan();

		// Class Diamond 객체 p2 생성
		Diamond p2 = new Diamond();

		// Class Sungjuk 객체 p3 생성
		Sungjuk p3 = new Sungjuk();
		
		// 각 객체에서 console창에 출력하는 함수를 호출.
		p1.print2console();
		p2.print2console();		
		p3.print2console();
	}

}
