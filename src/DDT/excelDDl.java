package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelDDl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		//some times after adding pom apachi also
		//this will not work for this we have add 15 jar files which are present 
		//in desktop

		FileInputStream fis = new FileInputStream("./datas.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		driver.get(url);
		System.out.println("after lunching ");
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		String user_name_FromExcel = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		username.sendKeys(user_name_FromExcel);
		
		String passwordFromExcel = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		password.sendKeys(passwordFromExcel);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
