package OpenNewWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowOpen {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	
	//opening a new tab
	driver.switchTo().newWindow(WindowType.TAB);
	
	//if you want to open a new tabl just add Window in last 
	//driver.switchTo().newWindow(WindowType.WINDOW);

	
	driver.get("https://instagrame.com");
	
	//to get a address of tab we will use getwindowhandle and get handles	
	System.out.println(driver.getWindowHandle());
	
	//to get both tabs address we will use getWindowsHandles just add s
	System.out.println(driver.getWindowHandles());
}
}
