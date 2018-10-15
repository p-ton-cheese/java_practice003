package practice03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPractice {

	// Key값을 받아와서 데이터를 읽어오는 메소드.
	public void read(String paraStr) {
		
		// Properties 객체 생성.
		Properties properties = new Properties();
	    
		// Read properties file.
	    try {
	    	// Properties 파일 load 
	    	properties.load(new FileInputStream("test.properties"));
	    } catch (IOException e) {
	    	System.out.println("File Input Stream error!!");
	    }

	    // getProperty로 Key 값을 넣어 properties파일에 저장되어 있는 데이터를 받음.
	    String avalue = properties.getProperty(paraStr);
	    
	    // console에 표시 
	    System.out.println(avalue);
	}
	
	// 데이터를 읽어오는 메소드.
	public void read() {
		
		// Properties 객체 생성.
		Properties properties = new Properties();
	    
		// Read properties file.
	    try {
	      properties.load(new FileInputStream("test.properties"));
	    } catch (IOException e) {
	    	System.out.println("File Input Stream error!!");
	    }

	    // a라는 key 값에 저장된 데이터를 가져옴.
	    String avalue = properties.getProperty("a");
	    
	    System.out.println(avalue);
	}
	
	// Properties 파일에 쓰기
	public void write() {
		
		Properties properties = new Properties();
	    
		// properties 파엘에 저장할 때는 setProperty로 저장. key 값, 데이터로 넘김.
	    properties.setProperty("a", "properties test");

	    // Write properties file.
	    try {
	    	// setProperty의 데이터를 properties 파일에 저장.
	    	properties.store(new FileOutputStream("test.properties"), null);
	    } catch(IOException e) {
	    	System.out.println("File Output Stream error!!");
	    }
	}
}
