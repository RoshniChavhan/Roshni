package Packg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// Browser launch
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div")).click();
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("8855022646");
	String str =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/p/span")).getText();
	System.out.println(str);
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
	WebElement web=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button"));
	web.click();

	
	
	 
		

	}

}
