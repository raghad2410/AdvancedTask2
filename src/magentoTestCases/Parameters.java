package magentoTestCases;

import java.util.Random;

import org.testng.asserts.SoftAssert;

public class Parameters {
	static String Url="https://magento.softwaretestingboard.com/";
	static String [] firstNameRandom={"Eman", "Ahmad", "Lana", "Eva", "Malik"};
	Random rand = new Random();
	int randomIndex = rand.nextInt(firstNameRandom.length);
	String randomName = firstNameRandom[randomIndex];

	static String [] lasttNameRandom={"Mohammad", "Khaled", "Hamze", "Ehab", "Oday"};
	Random rand1 = new Random();
	int randomIndex1 = rand1.nextInt(lasttNameRandom.length); // استخدم rand1 هنا
	String randomName1 = lasttNameRandom[randomIndex1];

	
    Random rand11 = new Random();
    int randomNumber = rand.nextInt(9000) + 1000;
    int randomIndex11 = rand.nextInt(firstNameRandom.length);
    String randomName11 = firstNameRandom[randomIndex];
    String randomEmail = randomName + randomNumber + "@example.com";
    String passwordd=randomName+randomNumber;

	static SoftAssert Check =new SoftAssert();
}