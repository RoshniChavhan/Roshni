import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test (priority=0)
  public void Testcheck() 
  {
	  
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  String STR=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getText();
	  System.out.println(STR);
	  
	  
	  Assert.assertEquals("Test", STR);
	  
  }
}
