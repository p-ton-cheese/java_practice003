package practice03_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropPractice {

	public String read(String paraStr) {
		Properties properties = new Properties();
	    
		// Read properties file.
	    try {
	      properties.load(new FileInputStream("test1.properties"));
	    } catch (IOException e) {
	    	System.out.println("File Input Stream error!!");
	    }

	    String avalue = properties.getProperty(paraStr);
	    	    
	    return avalue;
	}	
	
	public void write() {
		Properties properties = new Properties();
	    		    
	    properties.setProperty("a", "properties test");

	    // Write properties file.
	    try {
	      properties.store(new FileOutputStream("test1.properties"), null);
	    } catch(IOException e) {
	    	System.out.println("File Output Stream error!!");
	    }
	}
}
