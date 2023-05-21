package Poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TAP {
	WebDriver driver;
	String alertButtonXpath = "//button[text()='Click Me']";
	String text = "//*[@id='demo']";

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
}
