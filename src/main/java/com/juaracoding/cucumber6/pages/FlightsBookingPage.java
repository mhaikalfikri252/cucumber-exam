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
	AdultTraveller1 adultTraveller1 = new AdultTraveller1();
	AdultTraveller2 adultTraveller2 = new AdultTraveller2();
	ChildsTraveller3 childsTraveller3 = new ChildsTraveller3();
	InfantsTraveller4 infantsTraveller4 = new InfantsTraveller4();

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

	@FindBy(css = "#fadein > section > div > div > div > div > div.form-box.payment-received-wrap.mb-0 > div.form-title-wrap > h3 > span > strong")
	WebElement textReservation;

	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div:nth-child(4) > div > div > div > label")
	WebElement labelAgree;

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

	public void selectPassengers() {
		passengers.click();
//		increaseAdults.click();
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
		adultTraveller1.inputDataAdult1();
		je.executeScript("window.scrollBy(0, 500)");
		adultTraveller2.inputDataAdult2();
		je.executeScript("window.scrollBy(0, 500)");
		childsTraveller3.inputDataChild3();
		je.executeScript("window.scrollBy(0, 250)");
		infantsTraveller4.inputDataInfants4();
		je.executeScript("window.scrollBy(0, 500)");
//		je.executeScript("arguments[0].scrollIntoView();", payLater);
		payLater.click();
//		je.executeScript("arguments[0].scrollIntoView();", labelAgree);
//		je.executeScript("window.scrollBy(0, 250)");
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
