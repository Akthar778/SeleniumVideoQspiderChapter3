package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertiespractice {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		WebDriver driver = new ChromeDriver();
		driver.get(pobj.getProperty("url"));
	}

}
