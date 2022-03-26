package com.juaracoding.cucumber6.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber6.drivers.DriverSingleton;

public class FlightsBookingPage {
	WebDriver driver;

	public FlightsBookingPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#fadein > header > div.header-menu-wrapper.padding-right-100px.padding-left-100px > div > div > div > div > div.main-menu-content > nav > ul > li:nth-child(3) > a")
	WebElement btnFlights;

	@FindBy(id = "round-trip")
	WebElement radioBtnRoundTrip;

	@FindBy(id = "flight_type")
	WebElement flightType;

	@FindBy(id = "autocomplete")
	WebElement flyingFrom;

	@FindBy(id = "autocomplete2")
	WebElement toDestination;

	@FindBy(id = "departure")
	WebElement departureDate;

	@FindBy(id = "return")
	WebElement returnDate;

	@FindBy(css = "#onereturn > div.col-lg-1.pr-0 > div > div > div > a")
	WebElement passengers;

	@FindBy(css = "#onereturn > div.col-lg-1.pr-0 > div > div > div > div > div.dropdown-item.adult_qty > div > div > div.qtyInc")
	WebElement increaseAdults;

	@FindBy(css = "#onereturn > div.col-lg-1.pr-0 > div > div > div > div > div.dropdown-item.child_qty > div > div > div.qtyInc")
	WebElement increaseChilds;

	@FindBy(css = "#onereturn > div.col-lg-1.pr-0 > div > div > div > div > div.dropdown-item.infant_qty > div > div > div.qtyInc")
	WebElement increaseInfants;

	@FindBy(id = "flights-search")
	WebElement btnSearch;

	@FindBy(css = "#fadein > section.breadcrumb-area.bread-bg-flights > div > div > div > div:nth-child(2) > div > ul > li > a")
	WebElement titleFlightsBooking;

	@FindBy(css = "#data > ul > li:nth-child(1) > div > form > div > div.col-md-2 > div > button")
	WebElement btnBook;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div:nth-child(1) > div.card-body > div:nth-child(6) > div.col-md-4 > select")
	WebElement nationality;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(2) > div:nth-child(1) > select")
	WebElement nationality2;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(1) > div.col-md-2 > select")
	WebElement title;

	@FindBy(css = "#fadein > section > div > div > div > div > div.form-box.payment-received-wrap.mb-0 > div.form-title-wrap > h3 > span > strong")
	WebElement textReservation;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(1) > div.col-md-4 > input")
	WebElement firstName;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(1) > div.col-md-6 > input")
	WebElement lastName;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(2) > div:nth-child(2) > div > div.col-5 > select")
	WebElement DBmonth;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(2) > div:nth-child(2) > div > div.col-3 > select")
	WebElement DBday;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(2) > div:nth-child(2) > div > div.col-4 > select")
	WebElement DByear;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div.col-md-12 > input")
	WebElement passport;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div:nth-child(2) > div > div.col-5 > select")
	WebElement PIDMonth;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div:nth-child(2) > div > div.col-3 > select")
	WebElement PIDDay;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div:nth-child(2) > div > div.col-4 > select")
	WebElement PIDYear;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div:nth-child(3) > div > div.col-5 > select")
	WebElement PEDMonth;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div:nth-child(3) > div > div.col-3 > select")
	WebElement PEDDay;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(1) > div.card-body > div:nth-child(4) > div:nth-child(3) > div > div.col-4 > select")
	WebElement PEDYear;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div:nth-child(3) > div.form-title-wrap > h3")
	WebElement textPaymentMethod;

	@FindBy(css = "#myTab > div.col-md-4.mb-1.gateway_setmpos > div")
	WebElement payWithSetmpos;

	@FindBy(id = "gateway_pay-later")
	WebElement payLater;

	@FindBy(id = "agreechb")
	WebElement agree;

	@FindBy(id = "booking")
	WebElement btnConfirm;

	public void selectFlyingFrom(String subject) {
		flyingFrom.sendKeys(subject);
		flyingFrom.sendKeys(Keys.RETURN);
	}

	public void selectToDestination(String subject) {
		toDestination.sendKeys(subject);
		toDestination.sendKeys(Keys.RETURN);
	}

	public void selectDepartureDate(String date) {
		departureDate.sendKeys(Keys.chord(Keys.CONTROL + "a", date));
		departureDate.sendKeys(date, Keys.ENTER);
	}

	public void selectReturnDate(String date) {
		returnDate.sendKeys(Keys.chord(Keys.CONTROL + "a", date));
		returnDate.sendKeys(date, Keys.ENTER);
	}

	public void selectFlightType(int pilih) {
		flightType.click();
		List<Keys> listState = new ArrayList<Keys>();
		for (int i = 0; i < pilih; i++) {
			listState.add(Keys.DOWN);
		}
		listState.add(Keys.ENTER);
		CharSequence[] cs = listState.toArray(new CharSequence[listState.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

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

	public void selectNationality2(int pilih) {
		nationality2.click();
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

	public void selectPassengers() {
		passengers.click();
		increaseAdults.click();
		increaseChilds.click();
		increaseInfants.click();
	}

	public void goToMenuFlights() {
		btnFlights.click();
	}

	public void inputTujuanFlights() {
		radioBtnRoundTrip.click();
		selectFlightType(2);
		selectFlyingFrom("CGK");
		selectToDestination("BTJ");
		selectDepartureDate("10 April 2022");
		selectReturnDate("14 April 2022");
		selectPassengers();
		btnSearch.click();
		btnBook.click();
	}

	public void inputDataDiri() {
		selectNationality(2);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		selectTitle(2);
		firstName.sendKeys("test");
		lastName.sendKeys("aja");
		selectNationality2(4);
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
//		je.executeScript("window.scrollBy(0, 500)");
//		je.executeScript("arguments[0].scrollIntoView();", payLater);
		payLater.click();
		agree.click();
		btnConfirm.click();
	}

	public String getTitleFlightsBookingPage() {
		return driver.getTitle();
	}

	public String getTextReservation() {
		return textReservation.getText();
	}

}
