package magentoTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest  extends Parameters {
	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void mySetup() {
		driver.get(Url);
		WebElement signUp=driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		signUp.click();
		
	}
	
	@Test 
	public void LoginUser() {
		WebElement enterEmail =driver.findElement(By.id("email"));
		enterEmail.sendKeys(randomEmail);
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys(passwordd);
		WebElement signi=driver.findElement(By.id("send2"));
		signi.click();
		


	}
	
	@AfterTest
	public void MyAfterTest() {
		driver.quit();
	}
	

}
