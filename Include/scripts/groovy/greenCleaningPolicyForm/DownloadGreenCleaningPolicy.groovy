package greenCleaningPolicyForm
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

class DownloadGreenCleaningPolicy {
	/**
	 * In-house green cleaning policy (Option 1)
	 */

	@When("User downloads the uploaded files of Green Cleaning Policy")
	public void user_downloads_the_uploaded_files_of_Green_Cleaning_Policy() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of Green Cleaning Policy successfully")
	public void user_can_see_the_downloaded_file_of_Green_Cleaning_Policy_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of special circumstances for In-house green cleaning policy in GCP")
	public void user_downloads_the_uploaded_files_of_special_circumstances_for_In_house_green_cleaning_policy_in_GCP() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_SplCircum_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_SplCircum_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of special circumstances for In-house green cleaning policy in GCP")
	public void user_can_see_the_downloaded_file_of_special_circumstances_for_In_house_green_cleaning_policy_in_GCP() {

		new projectKeywords().verifyDownloadedFiles()
	}


	/**
	 * Certified cleaning service (Option 2)
	 */

	@When("User downloads the uploaded files of Cleaning Contract")
	public void user_downloads_the_uploaded_files_of_Cleaning_Contract() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of Cleaning Contract successfully")
	public void user_can_see_the_downloaded_file_of_Cleaning_Contract_successfully() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP")
	public void user_downloads_the_uploaded_files_of_special_circumstances_for_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_GCP() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_information_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_information_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP")
	public void user_can_see_the_downloaded_file_of_special_circumstances_for_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_GCP() {

		new projectKeywords().verifyDownloadedFiles()
	}
}