package NotificationPopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUpx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable notification");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.olx.in");
		



	}
}
