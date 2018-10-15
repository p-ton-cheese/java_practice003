package Practice03;

public class Practice03 {

	public static void main(String[] args) {

		PropertiesPractice prop = new PropertiesPractice();
		
		String propStr = "test.properties";
		prop.read("a");
		prop.read("MSG");
		prop.read("msg");
		prop.read(propStr);
		prop.read();		
	}

}
