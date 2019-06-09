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

import com.kms.katalon.core.configuration.RunConfiguration
import groovy.io.FileType
import leedOnlineKeywords.projectKeywords

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.testautomationguru.utility.PDFUtil
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import integratedPestMgmtForm.IPM_PageObjectClass



class integratedPestMgnt_Form {
	/**
	 * The navigation to IPM form -- Started
	 */


	@And("User can see Integrated Pest Management under Indoor Environmental Quality section")
	public void user_can_see_Integrated_Pest_Management_under_Indoor_Environmental_Quality_section() {

		WebUI.scrollToElement(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/div_Integrated Pest Management"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/div_Integrated Pest Management"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Integrated Pest Management")
	public void user_has_to_select_the_status_to_Attempted_for_Integrated_Pest_Management() {

		String status =	WebUI.getText(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "READY FOR REVIEW"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Integrated Pest Management")
	public void user_clicks_on_Integrated_Pest_Management() {

		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/div_Integrated Pest Management"))
	}

	@And("User has to click on FormV01 button of Integrated Pest Management")
	public void user_has_to_click_on_FormV_button_of_Integrated_Pest_Management() {

		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/a_Form (V01)"))
	}

	@Then("User should be able to see the Integrated Pest Management form")
	public void user_should_be_able_to_see_the_Integrated_Pest_Management_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/div_IPMForm"), 30)
		if (insideForm == true){
			println "Inside the IPM form"
		}
		else {
			println "Not inside the IPM form"
		}
	}


	/**
	 * The navigation to IPM form -- Ended
	 */



	/**
	 *  Filling the data in the IPM form for In-house IPM program(Option 1) , saving the form , downloading the Pdf and verifying -- Started
	 */

	@Given("User should see the radio button option for In-house IPM program")
	public void user_should_see_the_radio_button_option_for_In_house_IPM_program() {

		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present =	WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn"), 30)
		if (option1Present == true){
			println  "In-house IPM Program option is present"
		}
		else{
			println  "In-house IPM Program option is not present"
		}
	}

	@When("User clicks on In-house IPM program option")
	public void user_clicks_on_In_house_IPM_program_option() {

		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn"))
		WebUI.delay(2)
	}

	@Then("User should see the contents for In-house IPM program option")
	public void user_should_see_the_contents_for_In_house_IPM_program_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/IntegratedPestMgmt/iframe_Page"), 30)
		WebUI.verifyTextPresent("Option 1. In-house IPM program", false)
		WebUI.switchToDefaultContent()
	}


	@Given("User should be able to see the Add File button for integrated pest management plan")
	public void user_should_be_able_to_see_the_Add_File_button_for_integrated_pest_management_plan() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt'), 30)
	}

	@Then("User uploads file for integrated pest management plan")
	public void user_uploads_file_for_integrated_pest_management_plan() {

		String uploadButton 	= "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/btn_AddFile"
		String inputUploadFile 	= "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/input_Addfile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}



	@Given("User should be able to see the Add File button for the examples of the documentation used by the project")
	public void user_should_be_able_to_see_the_Add_File_button_for_the_examples_of_the_documentation_used_by_the_project() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/p_AddFileDocumentation'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/p_AddFileDocumentation'), 30)
	}

	@Then("User uploads file for the examples of the documentation used by the project")
	public void user_uploads_file_for_the_examples_of_the_documentation_used_by_the_project() {

		String uploadButton 	= "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/btn_AddFile"
		String inputUploadFile 	= "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/input_Addfile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}


	@Given("User should be able to see the Add File button for Pesticide application list")
	public void user_should_be_able_to_see_the_Add_File_button_for_Pesticide_application_list() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/p_Pesticide_AddFile'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/p_Pesticide_AddFile'), 30)
	}

	@Then("User uploads file for Pesticide application list")
	public void user_uploads_file_for_Pesticide_application_list() {

		String uploadButton 	= "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/btn_AddFile"
		String inputUploadFile 	= "Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/input_Addfile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the Add File button of special circumstances for In house IPM program in Integrated Pest Management")
	public void user_should_be_able_to_see_the_Add_File_button_of_special_circumstances_for_In_house_IPM_program_in_Integrated_Pest_Management() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/p_Upload_AddDoc_SC'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/p_Upload_AddDoc_SC'), 30)
	}

	@Then("User uploads file of special circumstances for In house IPM program in Integrated Pest Management")
	public void user_uploads_file_of_special_circumstances_for_In_house_IPM_program_in_Integrated_Pest_Management() {

		String uploadButton 	= "Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/btn_AddFile"
		String inputUploadFile 	= "Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/input_Addfile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_SpecialCircumstances = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt
	@Given("User should see the editor for Special Circumstances for In house IPM program in Integrated Pest Management")
	public void user_should_see_the_editor_for_Special_Circumstances_for_In_house_IPM_program_in_Integrated_Pest_Management() {

		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/P_SC_EditorBox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/P_SC_EditorBox'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box for In house IPM program in Integrated Pest Management")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_In_house_IPM_program_in_Integrated_Pest_Management() {

		println "##############"+ txt_SpecialCircumstances
		WebUI.setText(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/Body_SC_EditorBox'),txt_SpecialCircumstances)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for In house IPM program in Integrated Pest Management")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_In_house_IPM_program_in_Integrated_Pest_Management() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/Body_SC_EditorBox'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_SpecialCircumstances, false, FailureHandling.STOP_ON_FAILURE)
	}


	@Then("User has to verify Uploaded integrated pest management plan with downloaded pdf file")
	public void user_has_to_verify_Uploaded_integrated_pest_management_plan_with_downloaded_pdf_file() {

		String Table_Xpathid= IPM_PageObjectClass.table_Xpath_Integrated_Pest_Mgmt_Plan
		String scrollTo='Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_IntegratedPestMngmnt/p_IntegrartedPestMngnt'
		String iframe='Object Repository/IntegratedPestMgmt/iframe_Page'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@And("User has to verify Uploaded examples of the documentation used by the project with downloaded pdf file")
	public void user_has_to_verify_Uploaded_examples_of_the_documentation_used_by_the_project_with_downloaded_pdf_file() {

		String Table_Xpathid= IPM_PageObjectClass.table_Xpath_Examples_Documentation
		String scrollTo='Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_Examples_Documentation/p_AddFileDocumentation'
		String iframe='Object Repository/IntegratedPestMgmt/iframe_Page'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@And("User has to verify Uploaded Pesticide application list with downloaded pdf file")
	public void user_has_to_verify_Uploaded_Pesticide_application_list_with_downloaded_pdf_file() {

		String Table_Xpathid= IPM_PageObjectClass.table_Xpath_PestcideAppList
		String scrollTo='Object Repository/IntegratedPestMgmt/Option_IPMProgram/AddFile_PestcideAppList/p_Pesticide_AddFile'
		String iframe='Object Repository/IntegratedPestMgmt/iframe_Page'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@And("User has to verify the Special Circumstances html editor for In house IPM program with downloaded pdf file")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_for_In_house_IPM_program_with_downloaded_pdf_file() {

		String Editorpath='Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/Body_SC_EditorBox'
		String scroll='Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/P_SC_EditorBox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded additional documentation for In house IPM program with downloaded pdf file")
	public void user_has_to_verify_Uploaded_additional_documentation_for_In_house_IPM_program_with_downloaded_pdf_file() {


		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= IPM_PageObjectClass.table_Xpath_SpecialCircumstances
		String scrollTo='Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/p_Upload_AddDoc_SC'
		String iframe='Object Repository/IntegratedPestMgmt/iframe_Page'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
		new projectKeywords().deleteDownloadedFiles(path)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for Integrated Pest Management Form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Integrated_Pest_Management_Form() {

		String narrativeSplCircum  = WebUI.getText(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/Body_SC_EditorBox'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_SpecialCircumstances, false, FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the status to ready for review for the IMP form")
	public void user_changes_the_status_to_mark_for_review(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/h3_Status"))
		println "######################### h3" + status

		if (status == "ATTEMPTED"){
			println "Inside the if clicked Ready For Review"

			WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changedStatus =	WebUI.getText(findTestObject("Object Repository/IntegratedPestMgmt/Navigation/h3_Status"))
		println "The changed Status is "+changedStatus
	}
	/**
	 *  Filling the data in the IPM form for In-house IPM program(Option 1) , saving the form , downloading the Pdf and verifying -- Ending
	 */


	/**
	 *  Filling the data in the IPM form for Certified IPM Service(Option 2) , saving the form , downloading the Pdf and verifying -- Starting
	 */

	@Given("User should see the radio button option Certified IPM service")
	public void user_should_see_the_radio_button_option_Certified_IPM_service() {

		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		boolean option2Present = WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_Option2_RadioBtn"), 30)
		if (option2Present == true){
			println  "In-house IPM Program option is present"
		}
		else{
			println  "In-house IPM Program option is not present"
		}
	}

	@When("User clicks on Certified IPM service option")
	public void user_clicks_on_Certified_IPM_service_option() {

		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_Option2_RadioBtn"))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Certified IPM service option")
	public void user_should_see_the_contents_for_Certified_IPM_service_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/IntegratedPestMgmt/iframe_Page"), 30)
		WebUI.verifyTextPresent("Option 2. Certified IPM service", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button for integrated pest management service contract")
	public void user_should_be_able_to_see_the_Add_File_button_for_integrated_pest_management_service_contract() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt'), 30)
	}

	@Then("User uploads file for integrated pest management service contract")
	public void user_uploads_file_for_integrated_pest_management_service_contract() {

		String uploadButton 	= "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Btn_AddFile"
		String inputUploadFile 	= "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Given("User should be able to see the textbox for integrated pest management service is certified and in good standing with")
	public void user_should_be_able_to_see_the_textbox_for_integrated_pest_management_service_is_certified_and_in_good_standing_with() {

		boolean txt_Present = WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService"), 30)
		if (txt_Present == true){
			println "textbox for integrated pest management service is present"
		}
		else {
			println "textbox for integrated pest management service is not present"
		}
	}

	static String txt_dataIPM
	@When("User enters the data for integrated pest management service is certified and in good standing with")
	public void user_enters_the_data_for_integrated_pest_management_service_is_certified_and_in_good_standing_with() {

		txt_dataIPM = "expires on Dec 30 2019"
		WebUI.setText(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService"), txt_dataIPM)
	}

	String enterdValue
	@Then("User should be able to see the entered value in integrated pest management service is certified and in good standing with")
	public void user_should_be_able_to_see_the_entered_value_in_integrated_pest_management_service_is_certified_and_in_good_standing_with() {

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService'), 'value')
		println "The entered Value is "+ enterdValue
		println "The txt_PersentIncrease is " + txt_dataIPM
		WebUI.verifyMatch(txt_dataIPM, enterdValue, false)
	}

	@Given("User should be able to see the Add File button for the information showing the contractor’s GreenPro, EcoWise, GreenShield")
	public void user_should_be_able_to_see_the_Add_File_button_for_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile'), 30)
	}

	@Then("User uploads file for the information showing the contractor’s GreenPro, EcoWise, GreenShield")
	public void user_uploads_file_for_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield() {

		String uploadButton 	= "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/Btn_AddFile"
		String inputUploadFile 	= "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/Input_AddFile"

		new projectKeywords().uploadMultipleFiles(uploadButton, inputUploadFile)
	}

	@Then("User has to verify Uploaded integrated pest management service contract with downloaded pdf file")
	public void user_has_to_verify_Uploaded_integrated_pest_management_service_contract_with_downloaded_pdf_file() {

		String Table_Xpathid= IPM_PageObjectClass.table_Xpath_IPM_ServiceContract
		String scrollTo='Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile'
		String iframe='Object Repository/IntegratedPestMgmt/iframe_Page'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)
		WebUI.switchToDefaultContent()
	}

	@Then("User has to verify the data in integrated pest management service is certified and in good standing with with downloaded pdf file")
	public void user_had_to_verify_the_data_in_integrated_pest_management_service_is_certified_and_in_good_standing_with_with_downloaded_pdf_file() {

		def txt_data = WebUI.getAttribute(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService'), 'value')
		println "The Percenatge value in the form is " +txt_data
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)
		if(file.contains(txt_data)) {
			println("The value in the precentage text is found in the pdf --> Found")
		}
		else {
			println("The value in the precentage text is not found in the pdf --> Not Found")
		}
	}

	@Then("User has to verify Uploaded the information showing the contractor’s GreenPro, EcoWise, GreenShield with downloaded pdf file")
	public void user_has_to_verify_Uploaded_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield_with_downloaded_pdf_file() {

		String path = RunConfiguration.getProjectDir()+'/Include/TestData/DownloadedFiles'

		String Table_Xpathid= IPM_PageObjectClass.table_Xpath_GreenPro_Certification
		String scrollTo='Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile'
		String iframe='Object Repository/IntegratedPestMgmt/iframe_Page'
		new projectKeywords().compareUploadedFileWithPDF1(Table_Xpathid,scrollTo,iframe)
		WebUI.switchToDefaultContent()

		new projectKeywords().deleteDownloadedFiles(path)
	}

	@Then("User verifies the entered value in integrated pest management service is certified and in good standing with")
	public void user_verifies_the_entered_value_in_integrated_pest_management_service_is_certified_and_in_good_standing_with() {

		String enteredValue = WebUI.getAttribute(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService'), 'value')
		println "################# Enteredvalue" + enteredValue
		println "################# txt_dataIPM" + txt_dataIPM
		WebUI.verifyMatch(txt_dataIPM, enteredValue, false)
	}
	/**
	 *  Filling the data in the IPM form for Certified IPM Service(Option 2) , saving the form , downloading the Pdf and verifying -- Ending
	 */
}