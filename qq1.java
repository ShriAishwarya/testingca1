package ca1;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qq1 {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co= new ChromeOptions();
		co.addArguments("==remote=allow=origins=*");
		driver=new ChromeDriver(co); 
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/realme-Segment-Fastest-Charging-High-res/dp/B0BZ466BWW/ref=sr_1_1_sspa?keywords=phone&qid=1683189100&s=electronics&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		WebElement add=driver.findElement(By.id("add-to-cart-button"));
		add.click();
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
	}
}
