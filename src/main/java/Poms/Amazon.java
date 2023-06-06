package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Amazon{
		WebDriver driver;
		
		String barraAmz = "//*[@id='twotabsearchtextbox']";
		String searchBarId = "APjFqb";
		String text = "//h3[@class='LC20lb MBeuO DKV0Md']";
		String sam = "//*[@id='p_89/SAMSUNG']/span/a/div/label/i";
		String precio = "//span[@class='a-price-whole']";
		String nombre = ".//h2/a/span";
		
		public Amazon(WebDriver driver) {
			super();
			this.driver = driver;
		}
		public void  typeOnSearchBar(String value) {
			WebElement searchBar = driver.findElement(By.id(searchBarId));
			searchBar.sendKeys(value);
			searchBar.sendKeys(Keys.ENTER);
		}
		public void clickResultById(int result) {
			List <WebElement> list = driver.findElements(By.xpath(text));
			list.get(result).click();
			System.out.println(list.size());
		}
		public void  typeSearchBar(String value) {
			WebElement searchBar = driver.findElement(By.xpath(barraAmz));
			searchBar.sendKeys(value);
			searchBar.sendKeys(Keys.ENTER);
		}
		public void selectSamsumg() {
			WebElement sm = driver.findElement(By.xpath(sam));
			sm.click();
		}
		public void precioMinimo() {
		    List<WebElement> cost = driver.findElements(By.xpath(precio));
		    
		    int menor = Integer.MAX_VALUE;
		    int contador = 0;
		    int posicion = 0;
	        for (WebElement i : cost) {
	            int price = Integer.parseInt(i.getText().replace(",",""));
	            contador++;
	            if (price < menor) {
	                menor = price;
	                posicion = contador;
	            }
	        }
	        
	        System.out.println(menor);
	        
	        //List <WebElement> productName = driver.findElements(By.xpath(nombre));
		   
	        //System.out.println(productName.get(posicion).getText());
		}
}

