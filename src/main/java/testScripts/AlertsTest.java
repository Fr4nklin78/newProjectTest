package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
	
		driver.findElement(By.xpath("//button[@class= 'btn btn-default']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.dismiss();
	}

}
