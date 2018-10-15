package Practice03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPractice {

	public void read(String paraStr) {
		Properties properties = new Properties();
	    
		// Read properties file.
	    try {
	      properties.load(new FileInputStream("test.properties"));
	    } catch (IOException e) {
	    	System.out.println("File Input Stream error!!");
	    }

	    String avalue = properties.getProperty(paraStr);
	    
	    System.out.println(avalue);
	}
	
	public void read() {
		
		Properties properties = new Properties();
	    
		// Read properties file.
	    try {
	      properties.load(new FileInputStream("test.properties"));
	    } catch (IOException e) {
	    	System.out.println("File Input Stream error!!");
	    }

	    String avalue = properties.getProperty("a");
	    
	    System.out.println(avalue);
	}
	
	
	public void write() {
		Properties properties = new Properties();
	    		    
	    properties.setProperty("a", "properties test");

	    // Write properties file.
	    try {
	      properties.store(new FileOutputStream("test.properties"), null);
	    } catch(IOException e) {
	    	System.out.println("File Output Stream error!!");
	    }
	}
}
