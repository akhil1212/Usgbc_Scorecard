package integratedPestMgmtForm
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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


class NegativeCases_IPM_InHouseProgram {
	/**
	 * Checking the negative test cases for the uploads in In-house IPM Program -- Option-1 ---- Started
	 */

	@Given("User should be in In-house IPM Program option")
	public void user_should_be_in_In_house_IPM_Program_option() {

		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn"))
		WebUI.delay(2)
	}


	@When("User uploads a file which is greater than 100mb of integrated pest management plan (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_integrated_pest_management_plan_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/input_Addfile'), myPdffilePath)
	}



	@When("User uploads a file of integrated pest management plan (.*)")
	public void user_uploads_a_file_of_integrated_pest_management_plan_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/input_Addfile'), myPdffilePath)
	}


	@When("User uploads a file which is greater than 100mb of the examples of the documentation used by the project (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_the_examples_of_the_documentation_used_by_the_project_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/p_AddFileDocumentation'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/input_Addfile'), myPdffilePath)
	}

	@When("User uploads a file of the examples of the documentation used by the project (.*)")
	public void user_uploads_a_file_of_the_examples_of_the_documentation_used_by_the_project_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/p_AddFileDocumentation'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/input_Addfile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of Pesticide application list (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Pesticide_application_list_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/p_Pesticide_AddFile'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/input_Addfile'), myPdffilePath)
	}

	@When("User uploads a file of special circumstances for Pesticide application list (.*)")
	public void user_uploads_a_file_of_special_circumstances_for_Pesticide_application_list_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/p_Pesticide_AddFile'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/input_Addfile'), myPdffilePath)
	}

	/**
	 * Checking the neagtive test cases for the uploads in In-house IPM Program -- Option-1 ---- Ended
	 */
}