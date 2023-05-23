package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TAP {
	WebDriver driver;
	String alertButtonXpath = "//button[text()='Click Me']";
	String text = "//*[@id='demo']";
	String filesXpath = "//select[@name='files']";
	String speedXpath = "//*[@id='speed']";
	String number = "//*[@id='number']";
	
	//Sesion3
	public TAP(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void clickAlertButton(){
		WebElement button = this.driver.findElement(By.xpath(alertButtonXpath));
		button.click();
	}
	
	public void acceptAlert() {
		this.driver.switchTo().alert().accept();
	}
	public void cancelAlert() {
		this.driver.switchTo().alert().dismiss();;
	}
	public void printText() {
		WebElement fr = driver.findElement(By.xpath(text));
		System.out.println(fr.getText());
	}
	//Sesion 4
	public String selectCheckBoxByValue(String option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(filesXpath)));
		
		List <WebElement> options = cb.getOptions();
		
		for(WebElement element: options) {
			String auxValue = element.getAttribute("value");
			if(auxValue.equals(option)) {
				value = element.getText();
			}
		}
		
		cb.selectByValue(option);
		return value;
	}
	
	public String selectCheckBoxByText(String option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(speedXpath)));
		
		List <WebElement> options = cb.getOptions();
		
		for(WebElement element: options) {
			String auxValue = element.getAttribute("value");
			if(auxValue.equals(option)) {
				value = element.getText();
			}
		}
				
		
		cb.selectByVisibleText(option);
		return value;
	}
	
	public String selectCheckBoxByIndex(int option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(number)));
		
		List <WebElement> options = cb.getOptions();
		
		for(WebElement element: options) {
			String auxValue = element.getAttribute("value");
			if(auxValue.equals(String.valueOf(option))) {
				value = element.getText();
			}
		}
		
		cb.selectByIndex(option);
		return value;
	}
}
