package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest 
{
	
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement srchBox = driver.findElement(By.name("search"));
		srchBox.sendKeys("phone");
		
////		actions.contextClick(srchBox).perform();
//		WebElement menu = driver.findElement(
//				By.cssSelector("url.nav.navbar-nav > li:nth-child(3)"));
//		WebElement subMenu = driver.findElement(
//				By.xpath("//ul[@class = 'list-unstyled']//a[contains(text(), 'Monitors')]"));
//		actions.moveToElement(menu).click(subMenu).build().perform();
		
		

	}
}
