package coding.veera.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class StoreProperties {
	
	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		p.setProperty("IDE", "IDE");
		p.setProperty("Edition", "Enterprise Edition");
		p.store(new FileWriter("src/output.properties"), "created properties file");
		System.out.println("Stored in project src folder, file name - output.properties");
	}

}
