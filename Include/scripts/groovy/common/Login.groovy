package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.configuration.RunConfiguration
import groovy.io.FileType
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.SelectorMethod
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.SessionId
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Capabilities;

import leedOnlineKeywords.projectKeywords


class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	String Url = GlobalVariable.Url
	String userName = GlobalVariable.userName
	String password = GlobalVariable.password

	@Given("User has to navigate to leed online home page")
	public void user_has_to_navigate_to_leed_online_home_page() {

		WebUI.openBrowser("")
		WebUI.navigateToUrl(Url)
		RemoteWebDriver driver = DriverFactory.getWebDriver()
		println "The driver is ########### " + driver

		String downloadPath = "/var/lib/jenkins/workspace/LeedOnline_ScoreCard/Usgbc_LeedOnline_ScoreCard/Include/TestData/DownloadedFiles"
		//String downloadPath = "G:\\Sabareesh\\MyGitRepos\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Include\\TestData\\DownloadedFiles"
		//String downloadPath = "H:\\Git Projects\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Include\\TestData\\DownloadedFiles"


		new projectKeywords().sendCommandForDownloadChromeHeadLess((HttpCommandExecutor)driver.getCommandExecutor(),driver.getSessionId(), downloadPath )
	}

	@And("User enters the username and password")
	public void user_enters_the_username_and_password() {

		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Login/input_username'), userName)
		WebUI.setText(findTestObject('Object Repository/Login/input_password'), password)
	}

	@And("User has to accept end user license agreement")
	public void user_has_to_accept_End_user_license_Agreement() {

		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Object Repository/Login/span_End User License Agreement'), 30)

		boolean userAgreemntVisible = WebUI.waitForElementVisible(findTestObject('Object Repository/Login/span_End User License Agreement'), 30)

		if (userAgreemntVisible == true){
			WebUI.check(findTestObject('Object Repository/Login/span_End User License Agreement'))
		}
		else{
			println "End user license agreement not visible/not checked"
		}
	}

	@When("User clicks on LOG IN button")
	public void user_clicks_on_LOG_IN_button() {

		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Login/button_Log In'))
	}

	@Then("User clicks on Project")
	public void user_clicks_on_Project() {

		TestObject projectName  = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[@title="BDDv4.1TestProject"]', true)
		WebUI.click(projectName)
	}

	@And("User navigates to the credits page of the project")
	public void user_navigates_to_the_credits_page_of_the_project() {

		WebUI.click(findTestObject('Object Repository/Login/a_Credits'))
	}
}