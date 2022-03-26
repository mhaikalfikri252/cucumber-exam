package com.juaracoding.cucumber6.glue;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber6.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber6.drivers.DriverSingleton;
import com.juaracoding.cucumber6.pages.FlightsBookingPage;
import com.juaracoding.cucumber6.pages.HotelsBookingPage;
import com.juaracoding.cucumber6.pages.LoginPage;
import com.juaracoding.cucumber6.utils.ConfigurationProperties;
import com.juaracoding.cucumber6.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;
	private HotelsBookingPage hotelsBookingPage;
	private FlightsBookingPage flightsBookingPage;

	@Autowired
	ConfigurationProperties configurationProperties;

	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		hotelsBookingPage = new HotelsBookingPage();
		flightsBookingPage = new FlightsBookingPage();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}

	@When("Customer klik login button")
	public void customer_klik_login_button() {
		loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
	}

	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		// refresh
		driver.navigate().refresh();
		tunggu();
		assertEquals(configurationProperties.getTextWelcome(), loginPage.getTextWelcome());
	}

	@When("Customer klik menu Hotels")
	public void customer_klik_menu_hotels() {
		hotelsBookingPage.goToMenuHotels();
	}

	@And("Customer mengisi data hotels booking")
	public void customer_mengisi_data_hotels_booking() {
		hotelsBookingPage.inputHotelsBooking();
		tunggu();
	}

	@Then("Customer ditampilkan pilihan hotels")
	public void customer_ditampilkan_pilihan_hotels() {
		assertEquals(configurationProperties.getTitleHotelsBooking(), hotelsBookingPage.getTitleHotelsBookingPage());
	}

	@When("Customer klik menu Flights")
	public void customer_klik_menu_flights() {
		flightsBookingPage.goToMenuFlights();
	}

	@And("Customer mengisi tujuan flights")
	public void customer_mengisi_tujuan_flights() {
		flightsBookingPage.inputTujuanFlights();
		tunggu();
	}

	@And("Customer mengisi data diri")
	public void customer_mengisi_data_diri() {
		flightsBookingPage.inputDataDiri();
		tunggu();
	}

	@Then("Customer ditampilkan booking_invoice")
	public void customer_ditampilkan_booking_invoice() {
		assertEquals(configurationProperties.getTextReservation(), flightsBookingPage.getTextReservation());
	}

	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
