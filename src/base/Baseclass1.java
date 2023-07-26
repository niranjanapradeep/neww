package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	 public WebDriver driver1;
		@BeforeClass
		public void setup()
		{
			driver1=new ChromeDriver();
			driver1.get("https://neofaa.com/");
			driver1.manage().window().maximize();
			
		}
}