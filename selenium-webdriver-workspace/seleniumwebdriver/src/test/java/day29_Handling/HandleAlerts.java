package day29_Handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal Alert - with OK button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		//It has Type Alert that has to be imported, and need 
		//to switch driver from web page to alert 
		
		Alert myAlert = driver.switchTo().alert();
		//to capture text inside alert
		System.out.println(myAlert.getText());
		myAlert.accept();
		
		
		//Confirmation Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); // Closes Alert by OK button
		driver.switchTo().alert().dismiss();// Closes Alert by CANCEL button
		
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myPromptAlert = driver.switchTo().alert();
		myPromptAlert.sendKeys("Welcome");
		myPromptAlert.accept();
	}

}
