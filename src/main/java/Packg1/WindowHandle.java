package Packg1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.w3schools.com/js/");
		WebElement web =dr.findElement(By.xpath("//*[@id=\"certified_html_css_links_list\"]/div[1]/a[2]"));
		web.click();
		Set <String> st=dr.getWindowHandles();
		
		Iterator<String> it=st.iterator();
		String sparent=it.next();
		String schild=it.next();
		dr.switchTo().window(schild);
	System.out.println(	dr.getTitle());
	

	}

}
