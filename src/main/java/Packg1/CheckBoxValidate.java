package Packg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxValidate {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://getcssscan.com/css-checkboxes-examples");
		WebElement web = driver.findElement(By.xpath("/html/body/ul/li[1]/div/label/text()"));
		web.click();
		boolean bl = web.isSelected();
		Assert.assertTrue(bl);
	}
}
