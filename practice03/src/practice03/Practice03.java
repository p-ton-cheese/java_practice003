package practice03;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertiesPractice prop = new PropertiesPractice();
		
		String propStr = "test.properties";
		prop.read("a");
		prop.read("MSG");
		prop.read("msg");
		prop.read(propStr);
		prop.read();
	}

}
