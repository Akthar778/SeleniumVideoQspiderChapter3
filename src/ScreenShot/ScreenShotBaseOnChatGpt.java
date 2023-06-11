package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotBaseOnChatGpt {

	public static void main(String[] args) {

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the desired webpage
		driver.get("https://www.example.com");

		// Take the screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		// Specify the location to save the screenshot
		String screenshotPath = "photos/screenshot.png";

		try {
			// Save the screenshot to the specified location
			FileUtils.copyFile(screenshot, new File(screenshotPath));
			System.out.println("Screenshot saved to: " + screenshotPath);
		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
		}

		// Close the browser
		driver.quit();

	}

}
