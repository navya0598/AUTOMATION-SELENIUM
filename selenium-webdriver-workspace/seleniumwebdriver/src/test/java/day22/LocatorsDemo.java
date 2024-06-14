package day22;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//maximize the window
		driver.manage().window().maximize();
		
		//name locator - for search
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id locator
		boolean display_status = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(display_status);
		
		//linktext & partiallinktext
     	//driver.findElement(By.linkText("Tablets")).click();		//preffered
		//driver.findElement(By.partialLinkText("Tabl")).click();		
		
		//class name
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of links  "+headerLinks.size());// to count the links
		
		//tag name
		//to finding total number of all links
		List<WebElement> taglinkcount = driver.findElements(By.tagName("a"));
		System.out.println("Total number of all a links  "+taglinkcount.size());// to count the links
		
		List<WebElement> tagimgcount = driver.findElements(By.tagName("img"));
		System.out.println("Total number of all a images  "+tagimgcount.size());// to count the links

		
		
	}

}
