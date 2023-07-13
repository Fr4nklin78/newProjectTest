package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement schbox = driver.findElement(By.className("gLFyf"));
		schbox.sendKeys("Java Tutorial");
		Thread.sleep(1000);
		List<WebElement> items = driver.findElements(
				By.xpath("((//ul[@jsname=\"bw4e9b\"])[1]//div[@class=\"wM6W7d\"])"));
		System.out.println("No. Of Items: " + items.size());
		for(int i=0;i<items.size(); i++)
		{
			System.out.println(items.get(i).getText());
			if(items.get(i).getText().equalsIgnoreCase("Java tutorial pdf"))
			{
				items.get(i).click();
				break;
			}
			
		}
		
	}
}

