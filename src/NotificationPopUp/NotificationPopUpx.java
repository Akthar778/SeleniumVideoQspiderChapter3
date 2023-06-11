package NotificationPopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUpx {
	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com");
		try {
			op.addArguments("--disable-notifications");
			System.out.println("Notifincation popup handled succesfully");
		}catch (Exception e) {
			System.out.println("Nofification popup hadalling fail");
		}




	}
}
