package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkBoxAndbuttonTest
{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

		WebElement optChk = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
		if(!optChk.isSelected())
		{
			optChk.click();
		}
	}

}
