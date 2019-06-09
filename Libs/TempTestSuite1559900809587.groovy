import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/GCP_SmokeTest')

suiteProperties.put('name', 'GCP_SmokeTest')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("H:\\Git Projects\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Reports\\GCP_SmokeTest\\20190607_151641\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GCP_SmokeTest', suiteProperties, [new TestCaseBinding('Test Cases/GreenCleaningPolicy/TC_GCP_CertifiedCleaningService', 'Test Cases/GreenCleaningPolicy/TC_GCP_CertifiedCleaningService',  null), new TestCaseBinding('Test Cases/GreenCleaningPolicy/TC_GCP_VerifyUploadedFile_option2', 'Test Cases/GreenCleaningPolicy/TC_GCP_VerifyUploadedFile_option2',  null), new TestCaseBinding('Test Cases/GreenCleaningPolicy/TC_GCP_DownloadFiles_option2', 'Test Cases/GreenCleaningPolicy/TC_GCP_DownloadFiles_option2',  null), new TestCaseBinding('Test Cases/GreenCleaningPolicy/TC_GCP_DeleteUploadedFiles_option2', 'Test Cases/GreenCleaningPolicy/TC_GCP_DeleteUploadedFiles_option2',  null)])
