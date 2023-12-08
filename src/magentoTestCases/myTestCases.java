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

			driver.get(TheWebSite);
//			WebElement Login = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));
//			Login.click();
		}

		@Test (priority = 1 )
		public void SignupTestCase() throws InterruptedException {
			driver.get(SignUpPage);
			WebElement firstName =driver.findElement(By.id("firstname"));
			WebElement lastName =driver.findElement(By.id("lastname"));
		    WebElement enterEmail =driver.findElement(By.id("email_address"));
			WebElement password =driver.findElement(By.id("password"));
			WebElement cofirmPassword =driver.findElement(By.id("password-confirmation"));
			WebElement pressBotten =driver.findElement(By.xpath("//button[@title='Create an Account']"));
	
			firstName.sendKeys(randomFirstName);
			lastName.sendKeys(randomLastName);
			enterEmail.sendKeys(randomEmail);
			password.sendKeys(emailPassword);
			cofirmPassword.sendKeys(emailPassword);
			pressBotten.click();
			
			Thread.sleep(2000) ;
			

			String WelcomeMSG = driver.findElement(By.xpath("//div[@class='panel header']")).getText();
			
			softassert.assertEquals( WelcomeMSG.contains("Welcome"), true , "Validation the signup process") ;
			
			softassert.assertAll();	
		}
		
		
		@Test (priority = 2)
		public void LogoutTest () throws InterruptedException {
			driver.get(logoutPage);
			Thread.sleep(7000) ;
			
			softassert.assertEquals(driver.getCurrentUrl(), TheWebSite);
			softassert.assertAll();	
		}
		
		@Test (priority = 3)
		public void LoginTest () {
			driver.get(loginPage);
			WebElement emailInput =driver.findElement(By.id("email"));
			WebElement passwordInput =driver.findElement(By.id("pass"));
			WebElement loginButton =driver.findElement(By.id("send2"));
			
			emailInput.sendKeys(randomEmail);
			passwordInput.sendKeys(emailPassword);
			loginButton.click();
			
            String Welcome = driver.findElement(By.xpath("//div[@class='panel header']")).getText();
			softassert.assertEquals( Welcome.contains("Welcome"), true , "Validation the signup process") ;
			softassert.assertAll();	
			
		}
		
		@AfterTest
		public void MyAfterTest() {
//			driver.quit();

		}

}