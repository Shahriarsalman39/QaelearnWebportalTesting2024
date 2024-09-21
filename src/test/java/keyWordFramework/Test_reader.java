package keyWordFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_reader {

	Properties pro;
	FileInputStream fis;
	public Test_reader() {
		pro = new Properties();
		String FilePath="src/test/resources/test.properties";
	 try {
		fis =new FileInputStream(FilePath);
		pro.load(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	}
	
	
	
	public String readBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String readUrl() {
		return pro.getProperty("Url");
	}
	
	public String readUsername() {
		return pro.getProperty("UserName");
		
	}
	
	public String readPassword() {
		return pro.getProperty("Password");
		
	}
	
}
