package test;

import org.testng.annotations.Test;

import base.Baseclass1;
import pages.loginpage;

public class Gtest extends Baseclass1 {
	@Test
	public void testing() throws InterruptedException
	{
		loginpage ob =new loginpage(driver1);
		ob.header();
		ob.Setvalues("ponnu123@gmail.com","ponnu123");
		ob.submit();
		ob.categorydropdown();
		Thread.sleep(3000);
		ob.tshirt();
		Thread.sleep(3000);
		ob.ptshirt();
		Thread.sleep(6000);
		ob.product();
		Thread.sleep(6000);
		ob.selectsize();
		Thread.sleep(3000);
		ob.cart();
		Thread.sleep(3000);
		ob.cart1();
		Thread.sleep(3000);
		ob.checkout();
		Thread.sleep(3000);
	   
	}
}
