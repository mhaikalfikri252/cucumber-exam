package com.juaracoding.cucumber6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber6.drivers.DriverSingleton;

public class AdultTraveller2 {
	WebDriver driver;

	public AdultTraveller2() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
}
