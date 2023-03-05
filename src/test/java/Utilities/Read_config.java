package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_config {

	Properties pro;

	public Read_config() {
		File file = new File("./Configuration\\config.properties");

		try {
			FileInputStream abc = new FileInputStream(file);
			pro = new Properties();
			pro.load(abc);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}
	public String getURL() {
		String url = pro.getProperty("url");
		return url;
	}
	public String getChromepath() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}
	public String getexpectedId() {
		String username = pro.getProperty(" ExpectedTitel");
		return username;
	}
	public String getExpOrderURL() {
		String username = pro.getProperty("expctedsalesorderurl");
		return username;
	}
}
