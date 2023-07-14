package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindoeTest {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Handle..."+parentWin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),new Tab')]")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("No of Windows..."+tabs.size());
		for(String child: tabs) {
			System.out.println(child);
			if(child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@class='menu-text'])[2]")).click();
			}
			driver.close();
			driver.switchTo().window(parentWin);
			driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.navigate().to("https://www.stqatools.com/demo/Windows.php");
			driver.quit();
		}
		
		
		
	}

}
