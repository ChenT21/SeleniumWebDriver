package scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.Amazon;

public class Sesion5 {

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
		Amazon az = new Amazon(driver);
		//bUSQUEDA
		Thread.sleep(2000);
		az.typeOnSearchBar("Amazon");
		Thread.sleep(1000);
		az.clickResultById(0);
		//Busqueda Amazon
		Thread.sleep(1000);
		az.typeSearchBar("Celulares");
		//Select Samsumg
		az.selectSamsumg();
		//Elegir el mas barato E Imprimir nombre del celular
		az.precioMinimo();
		
		
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}

}
