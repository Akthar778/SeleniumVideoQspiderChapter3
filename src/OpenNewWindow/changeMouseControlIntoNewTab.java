package OpenNewWindow;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.atn.EpsilonTransition;
import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class changeMouseControlIntoNewTab {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'GEARS')]")).click();
		WebElement skillryapp = driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']//a[@class='ignorelink'][normalize-space()='SkillRary Demo APP']"));
		skillryapp.click();
		//to change control into new tab
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		driver.findElement(By.xpath("//ul[@id='trending']//li//a[@href='product.php?product=selenium-training'][normalize-space()='Selenium Training']")).click();

		
		
		
	}
}
