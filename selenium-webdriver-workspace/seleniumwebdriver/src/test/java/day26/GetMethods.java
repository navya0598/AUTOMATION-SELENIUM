package day26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//getTitle()
		String title = driver.getTitle();		
		System.out.println(title);
		
		//getCurrenturl
		String getcurrenturl = driver.getCurrentUrl();
		System.out.println(getcurrenturl);
		
		//getPageSource
		//String pagescrouce = driver.getPageSource();
		//System.out.println(pagescrouce);
		
		
		//getWindowHandle
		String windowid = driver.getWindowHandle(); // dynamic
		System.out.println(windowid);//4DA8868DD97F9A78C46FF11F1425E3E2
									//4FBAE21F5DFC6E25EE54C9B2BEA63481
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//opens new browser window
		Set<String> multiplewindowid = driver.getWindowHandles();
		System.out.println(multiplewindowid+"multiplewindowid");


	}

}
