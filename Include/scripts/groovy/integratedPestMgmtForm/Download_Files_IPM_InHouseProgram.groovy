package integratedPestMgmtForm
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
import integratedPestMgmtForm.IPM_PageObjectClass


class Download_Files_IPM_InHouseProgram {
	/**
	 * Download the uploaded files in In-house IPM Program -- Option 1 ---- Started
	 */

	@When("User downloads the uploaded files of integrated pest management plan")
	public void user_downloads_the_uploaded_files_of_integrated_pest_management_plan() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_Integrated_PMP
		String tableId = IPM_PageObjectClass.tableId_Xpath_Integrated_PMP
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of integrated pest management plan")
	public void user_can_see_the_downloaded_file_of_integrated_pest_management_plan() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of the examples of the documentation used by the project")
	public void user_downloads_the_uploaded_files_of_the_examples_of_the_documentation_used_by_the_project() {
		String tableRow = IPM_PageObjectClass.tableRow_Xpath_Examples_Documentation
		String tableId = IPM_PageObjectClass.tableId_Xpath_Examples_Documentation
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/p_AddFileDocumentation"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of the examples of the documentation used by the project")
	public void user_can_see_the_downloaded_file_of_the_examples_of_the_documentation_used_by_the_project() {

		new projectKeywords().verifyDownloadedFiles()
	}



	@When("User downloads the uploaded files of Pesticide application list")
	public void user_downloads_the_uploaded_files_of_Pesticide_application_list() {
		String tableRow = IPM_PageObjectClass.tableRow_Xpath_PestcideAppList
		String tableId = IPM_PageObjectClass.tableId_Xpath_PestcideAppList
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/p_Pesticide_AddFile"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo)
	}

	@Then("User can see the downloaded file of Pesticide application list")
	public void user_can_see_the_downloaded_file_of_Pesticide_application_list() {

		new projectKeywords().verifyDownloadedFiles()
	}

	/**
	 * Download the uploaded files in In-house IPM Program -- Option 1 ---- Ended
	 */
}