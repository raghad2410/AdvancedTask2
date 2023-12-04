package magentoTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases extends Parameters  {
	WebDriver driver = new ChromeDriver();

		
		@BeforeTest

		public void mySetup() {
			driver.manage().window().maximize();

			driver.get(Url);
			WebElement Login = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));

			Login.click();

		}
		
		@Test 
		public void CreatOneUser() {
			WebElement firstName =driver.findElement(By.id("firstname"));
			WebElement lastName =driver.findElement(By.id("lastname"));
		    WebElement enterEmail =driver.findElement(By.id("email_address"));
			WebElement password =driver.findElement(By.id("password"));
			WebElement cofirmPassword =driver.findElement(By.id("password-confirmation"));
			WebElement pressBotten =driver.findElement(By.className("action"));
	
			firstName.sendKeys(firstNameRandom);
			lastName.sendKeys(lasttNameRandom);
			enterEmail.sendKeys(randomEmail);
			password.sendKeys(passwordd);
			cofirmPassword.sendKeys(passwordd);
			pressBotten.click();
			
			Check.assertAll();	
			
		}
		
		@AfterTest
		public void MyAfterTest() {
//			driver.quit();

		}

}