package coding.veera.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {
	
	public static void main(String[] args) throws IOException {
		
		Properties properties=new Properties();
		FileReader reader=new FileReader("D:\\Project-Workspaces\\Java\\Collection\\src\\details.properties");
		properties.load(reader);		
		System.out.println("IDE - "+properties.get("IDE"));
		System.out.println("Edition - "+properties.get("Edition"));
		
		System.out.println("---- System Properties ----");
		Properties sysProperites=System.getProperties();
		Set<?> s=sysProperites.entrySet();
		Iterator<?> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Entry) i.next();
			System.out.println(e.getKey()+"---->"+e.getValue());
		}
	}

}
