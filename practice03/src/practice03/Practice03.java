package practice03;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//프로퍼티 관련 클래스 선언.
		PropertiesPractice prop = new PropertiesPractice();
		
		// 파일명
		String propStr = "test.properties";
		
		//key 값을 입력하여 출력이 되는지 확인.
		prop.read("a");
		prop.read("MSG");
		prop.read("msg");
		prop.read(propStr);
		
		// key값 없이 메소드 내에서 처리하는것. 
		prop.read();
	}

}
