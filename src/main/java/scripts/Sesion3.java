package scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.TAP;

public class Sesion3 {
private WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		GooglePage gp = new GooglePage(driver);
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		gp.typeOnSearchBar("test automation practice");
		gp.clickResultById(1);
		//Aceptar
		tap.clickAlertButton();
		Thread.sleep(1000);
		tap.acceptAlert();
		tap.printText();

		
		//Cancelar
		Thread.sleep(1000);
		tap.clickAlertButton();
		Thread.sleep(1000);
		tap.cancelAlert();
		tap.printText();
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}

}
