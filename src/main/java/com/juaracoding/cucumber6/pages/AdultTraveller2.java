package com.juaracoding.cucumber6.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber6.drivers.DriverSingleton;

public class AdultTraveller2 {
	WebDriver driver;

	public AdultTraveller2() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(1) > div.col-md-2 > select")
	WebElement title;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(1) > div.col-md-4 > input")
	WebElement firstName;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(1) > div.col-md-6 > input")
	WebElement lastName;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(2) > div:nth-child(1) > select")
	WebElement nationality;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(2) > div:nth-child(2) > div > div.col-5 > select")
	WebElement DBmonth;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(2) > div:nth-child(2) > div > div.col-3 > select")
	WebElement DBday;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(2) > div:nth-child(2) > div > div.col-4 > select")
	WebElement DByear;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div.col-md-12 > input")
	WebElement passport;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div:nth-child(2) > div > div.col-5 > select")
	WebElement PIDMonth;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div:nth-child(2) > div > div.col-3 > select")
	WebElement PIDDay;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div:nth-child(2) > div > div.col-4 > select")
	WebElement PIDYear;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div:nth-child(3) > div > div.col-5 > select")
	WebElement PEDMonth;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div:nth-child(3) > div > div.col-3 > select")
	WebElement PEDDay;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div:nth-child(4) > div:nth-child(3) > div > div.col-4 > select")
	WebElement PEDYear;

	public void selectDBMonth(int pilih) {
		DBmonth.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectDBYear(int pilih) {
		DByear.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectDBDay(int pilih) {
		DBday.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectPIDMonth(int pilih) {
		PIDMonth.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectPIDDay(int pilih) {
		PIDDay.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectPIDYear(int pilih) {
		PIDYear.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectPEDMonth(int pilih) {
		PEDMonth.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectPEDDay(int pilih) {
		PEDDay.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectPEDYear(int pilih) {
		PEDYear.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectNationality(int pilih) {
		nationality.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void selectTitle(int pilih) {
		title.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void inputDataAdult2() {
		selectTitle(2);
		firstName.sendKeys("test");
		lastName.sendKeys("aja");
		selectNationality(4);
		selectDBMonth(4);
		selectDBDay(10);
		selectDBYear(12);
		passport.sendKeys("123456789");
		selectPIDMonth(3);
		selectPIDDay(4);
		selectPIDYear(5);
		selectPEDMonth(6);
		selectPEDDay(7);
		selectPEDYear(8);
	}
}
