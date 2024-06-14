package day23;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CssLocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		WebElement searchbox = driver.findElement(By.cssSelector("#small-searchterms"));
		searchbox.sendKeys("T-shirt");
		searchbox.clear();	
		
		//tag class	
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("navya");
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Hi");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Hi");
		
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("HelloWorld");

		
		
	}

}
