package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspScreenShotMethod {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		//type casting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//temp location
		File tempram = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			//spiciy the location
			File photopath = new File("./images/selenium.png");
			System.out.println("photo saved location is "+photopath);
			
			//temp location to required location 
			FileUtils.copyFile(tempram, photopath);

		}catch (Exception e) {
			System.out.println("photo is not saved ");
		}
	}

}
