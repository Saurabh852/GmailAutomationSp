package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriverWait wait;
	public WebDriver ldriver;

	public Login(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identifierId")
	WebElement username1;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
	WebElement nextButton;

	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")   
	WebElement pwd1;
	//(//input[contains(@name,Passwd)])[1]
	
	//(*[@class=\\"whsOnd zHQkBf\\\"])[1]

	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
	WebElement nextButton2;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement compose;

	@FindBy(xpath="//textarea[contains(@name,'to')]")
	WebElement to;
	////input[contains(@class,'agP aFw')]

	@FindBy(xpath = "//input[contains(@class,'aoT')]")
	WebElement subjectText;

	@FindBy(xpath = "//div[contains(@class,'Am Al editable LW-avf tS-tW')]")
	WebElement bodyText;

	@FindBy(xpath = "//div[contains(@class,'T-I J-J5-Ji aoO v7 T-I-atl L3')]")
	WebElement sendButton;

	public void getUN(String username) throws InterruptedException {
		Thread.sleep(2000);
		username1.sendKeys(username);

	}

	public void clickon() throws InterruptedException {
		Thread.sleep(2000);
		nextButton.click();
	}

	public void getPWD(String Password) throws InterruptedException {
		Thread.sleep(2000);
		pwd1.sendKeys(Password);
	}

	public void clickon1() throws InterruptedException {
		Thread.sleep(2000);
		nextButton2.click();
	}

	/*
	 * public void cancle() { canclebutton.click(); }
	 */
	public void compose() throws InterruptedException {
		Thread.sleep(2000);
		compose.click();
	}

	public void recepient(String receipent) throws InterruptedException {
		Thread.sleep(2000);
		to.sendKeys(receipent);
	}

	public void subject(String subject) throws InterruptedException {
		Thread.sleep(2000);
		subjectText.sendKeys(subject);
	}

	public void body(String body) throws InterruptedException {
		Thread.sleep(2000);
		bodyText.sendKeys(body);
	}

	public void sendButton() throws InterruptedException {
		Thread.sleep(2000);
		sendButton.click();
	}
}
