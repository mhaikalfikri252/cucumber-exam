package com.juaracoding.cucumber6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber6.drivers.DriverSingleton;

public class ChildsTraveller3 {
	WebDriver driver;

	public ChildsTraveller3() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
}
