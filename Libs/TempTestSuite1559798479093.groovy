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


suiteProperties.put('id', 'Test Suites/IPM_SmokeTest')

suiteProperties.put('name', 'IPM_SmokeTest')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("G:\\Sabareesh\\MyGitRepos\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Reports\\IPM_SmokeTest\\20190606_105119\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/IPM_SmokeTest', suiteProperties, [new TestCaseBinding('Test Cases/IntegratedPestManagement/TC_IPM_CertifiedService', 'Test Cases/IntegratedPestManagement/TC_IPM_CertifiedService',  null), new TestCaseBinding('Test Cases/IntegratedPestManagement/TC_Verify_Files_IPM_CertifiedService', 'Test Cases/IntegratedPestManagement/TC_Verify_Files_IPM_CertifiedService',  null), new TestCaseBinding('Test Cases/IntegratedPestManagement/TC_DownloadFiles_IPM_CertifiedService', 'Test Cases/IntegratedPestManagement/TC_DownloadFiles_IPM_CertifiedService',  null), new TestCaseBinding('Test Cases/IntegratedPestManagement/TC_Delete_Files_IPM_CertifiedService', 'Test Cases/IntegratedPestManagement/TC_Delete_Files_IPM_CertifiedService',  null)])
