package day22;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//Assignment
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		
		//Total number of links
		List<WebElement> linkscount = driver.findElements(By.tagName("a"));
		System.out.println(linkscount.size());
		
		//Total number of images
		List<WebElement> imagecount = driver.findElements(By.tagName("img"));
		System.out.println(imagecount.size());
		
		//Click any product link using linkText / partialtext
		driver.findElement(By.linkText("Laptops")).click();
		
		
	}

}
