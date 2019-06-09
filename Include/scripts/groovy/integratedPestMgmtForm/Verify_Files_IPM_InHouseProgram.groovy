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

import integratedPestMgmtForm.IPM_PageObjectClass
import leedOnlineKeywords.projectKeywords


class Verify_Files_IPM_InHouseProgram {
	/**
	 * To verify the Uploaded files in IPM - In-house IPM Program ---- Started
	 */
	@Given("User has to see the table of uploaded files on integrated pest management plan")
	public void user_has_to_see_the_table_of_uploaded_files_on_integrated_pest_management_plan() {

		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn"))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/table_IntegratedPestMgmt'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/table_IntegratedPestMgmt'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of integrated pest management plan")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_integrated_pest_management_plan() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_Integrated_PMP
		String tableId = IPM_PageObjectClass.tableId_Xpath_Integrated_PMP
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)
	}


	@Given("User has to see the table of uploaded files on the examples of the documentation used by the project")
	public void user_has_to_see_the_table_of_uploaded_files_on_the_examples_of_the_documentation_used_by_the_project() {

		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/table_ExamplesDocs'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/table_ExamplesDocs'), 30)
	}

	@Then("User verifies the file name uploaded with the examples of the documentation used by the project")
	public void user_verifies_the_file_name_uploaded_with_the_examples_of_the_documentation_used_by_the_project() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_Examples_Documentation
		String tableId = IPM_PageObjectClass.tableId_Xpath_Examples_Documentation
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)
	}

	@Given("User has to see the table of uploaded files on Pesticide application list")
	public void user_has_to_see_the_table_of_uploaded_files_on_Pesticide_application_list() {

		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/table_PesticideAppList'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/table_PesticideAppList'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Pesticide application list")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Pesticide_application_list() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_PestcideAppList
		String tableId = IPM_PageObjectClass.tableId_Xpath_PestcideAppList
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)
	}



	/**
	 * To verify the Uploaded files in IPM - In-house IPM Program ---- Ended
	 */
}