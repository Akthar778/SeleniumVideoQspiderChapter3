package actionsVideo16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrapDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		dropDown.click();
		
		Select sc = new Select(dropDown);
		
//		sc.selectByIndex(3);
//		sc.selectByValue("14339");
		sc.selectByVisibleText("Collectibles");

		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
