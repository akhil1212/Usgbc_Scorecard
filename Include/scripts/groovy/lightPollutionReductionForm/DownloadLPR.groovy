package lightPollutionReductionForm
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

import leedOnlineKeywords.projectKeywords
import com.kms.katalon.core.configuration.RunConfiguration

class DownloadLPR {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("User downloads the uploaded files of shielding information for each luminaire")
	public void user_downloads_the_uploaded_files_of_shielding_information_for_each_luminaire() {

		String xpath_Shielding_Information="//*[@id='shieldingInfoUpload_files']/table/tbody/tr"
		int count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)
		println "Count in table : "+count

		if (count > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)
			for (int k = count; k>=1; k--) {
				TestObject	 download = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="shieldingInfoUpload_files"]/table/tbody/tr['+k+']/td[5]/a[1]/i', true)
				WebUI.delay(2)
				WebUI.mouseOver(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'))
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				TestObject fileName =  new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="shieldingInfoUpload_files"]/table/tbody/tr['+k+']/td[1]', true)
				WebUI.click(download)
				new projectKeywords().IsFileExist(fileName)
				WebUI.switchToDefaultContent()
				WebUI.mouseOver(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'))
				WebUI.delay(2)
			}
			WebUI.delay(3)
		}
	}

	@Then("User can see the downloaded file of shielding information for each luminaires succesfully")
	public void user_can_see_the_downloaded_file_of_shielding_information_for_each_luminaires_succesfully() {

		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles'
		for(int i=1;i<=findTestData("UploadedData/UploadedFileNames").getRowNumbers();i++){
			WebUI.delay(2)
			String fname = findTestData("UploadedData/UploadedFileNames").getValue("FileNames", i)
			String isDownloaded = new projectKeywords().isFiledownloaded(path, fname)
			WebUI.verifyMatch(isDownloaded, fname, false)
		}
		new projectKeywords().deleteDownloadedFiles(path)
	}

	@When("User downloads the uploaded files of site plan, with scale and any related site features")
	public void user_downloads_the_uploaded_files_of_site_plan_with_scale_and_any_related_site_features() {

		String xpath_Site_Plan="//*[@id='sitePlanUpload_files']/table/tbody/tr"
		int count = (new projectKeywords()).countRowsPerPage(xpath_Site_Plan)
		println "Count in table : "+count

		if (count > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)
			for (int k = count; k>=1; k--) {
				TestObject	 download = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="sitePlanUpload_files"]/table/tbody/tr['+k+']/td[5]/a[1]/i', true)
				WebUI.delay(2)
				WebUI.mouseOver(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'))
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				TestObject fileName =  new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="sitePlanUpload_files"]/table/tbody/tr['+k+']/td[1]', true)
				WebUI.click(download)
				new projectKeywords().IsFileExist(fileName)
				WebUI.switchToDefaultContent()
				WebUI.mouseOver(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'))
				WebUI.delay(2)
			}
			WebUI.delay(3)
		}
	}

	@Then("User can see the downloaded file of site plan, with scale and any related site features")
	public void user_can_see_the_downloaded_file_of_site_plan_with_scale_and_any_related_site_features() {

		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles'
		for(int i=1;i<=findTestData("UploadedData/UploadedFileNames").getRowNumbers();i++){
			WebUI.delay(2)
			String fname = findTestData("UploadedData/UploadedFileNames").getValue("FileNames", i)
			String isDownloaded = new projectKeywords().isFiledownloaded(path, fname)
			WebUI.verifyMatch(isDownloaded, fname, false)
		}
		new projectKeywords().deleteDownloadedFiles(path)
	}

	@When("User downloads the uploaded files of special circumstances for fixture shielding in LPR")
	public void user_downloads_the_uploaded_files_of_special_circumstances_for_fixture_shielding_in_LPR() {

		String xpath_Special_Circum="//*[@id='splCircumstancesDocs_files']/table/tbody/tr"
		int count = (new projectKeywords()).countRowsPerPage(xpath_Special_Circum)
		println "Count in table : "+count

		if (count > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'), 30)
			for (int k = count; k>=1; k--) {
				TestObject	 download = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="splCircumstancesDocs_files"]/table/tbody/tr['+k+']/td[5]/a[1]/i', true)
				WebUI.delay(2)
				WebUI.mouseOver(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'))
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				TestObject fileName =  new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="splCircumstancesDocs_files"]/table/tbody/tr['+k+']/td[1]', true)
				WebUI.click(download)
				new projectKeywords().IsFileExist(fileName)
				WebUI.switchToDefaultContent()
				WebUI.mouseOver(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'))
				WebUI.delay(2)
			}
			WebUI.delay(3)
		}
	}

	@Then("User can see the downloaded file of special circumstances for fixture shielding in LPR")
	public void user_can_see_the_downloaded_file_of_special_circumstances_for_fixture_shielding_in_LPR() {

		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles'
		for(int i=1;i<=findTestData("UploadedData/UploadedFileNames").getRowNumbers();i++){
			WebUI.delay(2)
			String fname = findTestData("UploadedData/UploadedFileNames").getValue("FileNames", i)
			String isDownloaded = new projectKeywords().isFiledownloaded(path, fname)
			WebUI.verifyMatch(isDownloaded, fname, false)
		}
		new projectKeywords().deleteDownloadedFiles(path)
	}
}