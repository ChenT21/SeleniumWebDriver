package scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.TAP;

public class Sesion4 {
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
			Thread.sleep(2000);
			gp.typeOnSearchBar("test automation practice");
			gp.clickResultById(1);
			
			//Seleccion por Valor
			String value = tap.selectCheckBoxByValue("3");
			System.out.println(value);
			//Seleeccion por texto
			String value1 = tap.selectCheckBoxByText("Slow");
			System.out.println(value1);
			//Seleccion por indice
			String value2 = tap.selectCheckBoxByIndex(1);
			System.out.println(value2);
			
		}
		
		@After
		public void teardown() {
			
			driver.quit();
		}

}
;