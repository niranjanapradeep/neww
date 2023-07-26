package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
WebDriver driver1;
	
	By login=By.xpath("//a[@href='https://neofaa.com/account/login?return_url=%2Faccount']");
	By email=By.name("login");
	By password=By.name("password");
	By submit=By.xpath("//button[@class='btn btn--primary btn--solid']");
	By categorydropdown =By.xpath("//a[@class='navlink navlink--toplevel']");
	By tshirts=By.xpath("//a[@href='https://neofaa.com/collections/mommy-me-t-shirt']");
	By ptshirt=By.xpath("//a[@href='https://neofaa.com/collections/polo-t-shirt']");
	By product=By.xpath("//*[@id=\"resProduct\"]/div[1]/div/div[4]/a");
	By size=By.xpath("//*[@id=\"general\"]/div/div[2]/div/div[4]/div/div[5]/label");
	By addcart=By.id("btn-cart-add");
    By cart =By.xpath("//i[@class='nav__cart-icon navbar-tool-icon fas fa-shopping-cart lh22']");
	By checkout =By.xpath("//*[@id=\"navbarsticky\"]/div[1]/div/div[2]/div/div/div/a");
	
	public loginpage(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver1=driver1;
	}
	public void header()
	{
	driver1.findElement(login).click();
	}
	public void Setvalues(String username,String password)
	{
		driver1.findElement(email).sendKeys(username);
		//driver1.findElement(password).sendKeys(password);
	
	}
	public void submit()
	{
		driver1.findElement(submit).click();
	}
	public void categorydropdown()
	{
		driver1.findElement(categorydropdown).click();
	}
	public void tshirt()
	{
		driver1.findElement(tshirts).click();
	}
	public void ptshirt()
	{
		driver1.findElement(ptshirt).click();
	}
	public void product()
	{
		driver1.findElement(product).click();
	}
	public void selectsize()
	{
		driver1.findElement(size).click();
		
		
	}
	public void cart()
	{
		driver1.findElement(addcart).click();
	}
	public void cart1()
	{
		driver1.findElement(cart).click();
		
	}
	public void checkout()
	{
		driver1.findElement(checkout).click();
	}


}
