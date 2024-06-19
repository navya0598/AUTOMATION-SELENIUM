package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed()
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Status of logo"+logo.isDisplayed());		
//		
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Status of logo : "+status);
		
		//isEnabled()
		boolean input = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Status of input : "+input);
		
		//isSelected()
		WebElement malebt = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femalebt = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection ---------");
		System.out.println(malebt.isSelected());
		System.out.println(femalebt.isSelected());
		
		System.out.println("After Selection of male ---------");
		malebt.click();
		System.out.println(malebt.isSelected());
		System.out.println(femalebt.isSelected());
		
		WebElement news = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		System.out.println("News selected check: "+news.isSelected());

	}

}
