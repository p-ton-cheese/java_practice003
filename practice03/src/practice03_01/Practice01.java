package practice03_01;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Properties 파일을 관리하는 PropPractice 객체 생성
		PropPractice prop = new PropPractice();
		
		String propStr;
		
		// key값 Diamond에 저장되어 있는 data를 받아옴. 
		propStr = prop.read("Diamond");
		// 받아온 데이터를 정수형 데이터로 변환하여 저장할 변수.
		int line = 0;
 
		// data에 문자열이 있는 경우 에러
		try {
			// data를 정수형으로 변환할때 에러가 발생하는지 확인.
			line = Integer.parseInt(propStr);
			
			Diamond dia = new Diamond();
			
			// properties 파일에서 읽어온 diamond의 줄수 만큼 console에 표현.
			dia.print2console(line);
		} catch (NumberFormatException e) {
			System.out.println("--- error!! properties file data error!!");
		} 
		
		// 구구단 객체 생성
		Gugudan gugu = new Gugudan();
		
		// 구구단 console에 print.
		gugu.print2console();

		// 성적 객체 생성.
		Sungjuk sungjuk = new Sungjuk();

		// 성적 console에서 입력 받고 그것을 파일에 저장 및 불러와서 학점으로 변환 및 print.
		sungjuk.print2console();
	}

}
