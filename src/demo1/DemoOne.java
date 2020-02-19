package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoOne {
	
	@Test
	public void display()
	{
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", ".\\WebDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	}

}
