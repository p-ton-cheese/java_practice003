package practice02;

public class Practice1 {

	public static void main(String[] args) {
		// Class Gugudan 객체 생성
		Gugudan gugudan1 = new Gugudan();

		// Class Diamond 객체 생성
		Diamond diamond1 = new Diamond();

		// Class Sungjuk 객체 생성
		Sungjuk sungjuk1 = new Sungjuk();
		
		// 각 객체에서 console창에 출력하는 함수를 호출.
		gugudan1.print2console();
		diamond1.print2console();		
		sungjuk1.print2console();
	}

}