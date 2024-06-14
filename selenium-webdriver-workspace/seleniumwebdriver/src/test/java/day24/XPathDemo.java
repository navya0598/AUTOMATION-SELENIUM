package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		//XPath with single attribute
		//driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Tshirts");

		//XPath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
		//XPath with AND operator
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
		
		//XPath with OR operator
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("Tshirts");
		
		//XPath with inner text
		//driver.findElement(By.xpath("//*[text()='Tablets']")).click();
		/*boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		String displaystatusvalue = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(displaystatusvalue);*/
		
		//XPath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Hi");
		
		//XPath with start-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Navya");
		
		//CHAINED XPath
		boolean logostatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(logostatus);
		}
	

}
