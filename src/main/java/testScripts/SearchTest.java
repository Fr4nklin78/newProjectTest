package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		Thread.sleep(2000);
//		WebElement closeIcon = driver.findElement(By.linkText("Clear text"));
		WebElement closeIcon = driver.findElement(By.xpath("//a[@title = 'Clear text']"));
		
		
		System.out.println("Close Icon...."+closeIcon.isDisplayed());
		
		driver.findElement(By.cssSelector("#searchBar")).sendKeys("Test");
		Thread.sleep(2000);
		closeIcon = driver.findElement(By.xpath("//a[@title = 'Clear text']"));
		if(closeIcon.isDisplayed())
		{
			System.out.println("Close icon fter text..."+closeIcon.isDisplayed());
		closeIcon.click();	
			
		}
		System.out.println("Close Icon after clearing..."+closeIcon.isDisplayed());
		
	}

}
