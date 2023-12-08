package magentoTestCases;

import java.util.Random;
import org.testng.asserts.SoftAssert;

public class Parameters {
	SoftAssert softassert = new SoftAssert () ;
	
	static String TheWebSite="https://magento.softwaretestingboard.com/";
	static String SignUpPage="https://magento.softwaretestingboard.com/customer/account/create/";
	static String logoutPage="https://magento.softwaretestingboard.com/customer/account/logout/";
	static String loginPage = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/" ;
	
	static String [] firstName={"Farahhh", "Sarahhh", "Hayahh", "Linahh", "Suhahh"};
	static String [] lasttName={"Mohammad", "Khaled", "Hamzeh", "Ehab", "Oday"};
	
	Random rand = new Random();
	
	int randomIndex1 = rand.nextInt(firstName.length);
	String randomFirstName = firstName[randomIndex1];

	int randomIndex2 = rand.nextInt(lasttName.length);
	String randomLastName = lasttName[randomIndex1];
	
    int randomNumberForTheEmail = rand.nextInt(9000) + 1000;
    
    String randomEmail = randomFirstName + randomLastName + "@example.com";
    String emailPassword = randomFirstName + randomNumberForTheEmail;
}