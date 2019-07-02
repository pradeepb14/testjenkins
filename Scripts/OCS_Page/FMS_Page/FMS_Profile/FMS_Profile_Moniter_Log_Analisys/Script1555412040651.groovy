import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('OCS_Page_Test/FMS_Validate/FMS_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('FMS_Profile/Page_Healthcare Manager/i_archana mohini_icon icon-views'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FMS_Prof2/Page_Healthcare Manager/a_Monitor'))

if (false) {
    WebUI.click(findTestObject('FMS_Prof2/Page_Healthcare Manager/a_Logs'))

    WebUI.click(findTestObject('FMS_Prof2/Page_Healthcare Manager/a_Export'))
} else {
    WebUI.click(findTestObject('FMS_Prof2/Page_Healthcare Manager/a_Analysis'))

    WebUI.verifyElementPresent(findTestObject('FMS_Prof2/Page_Healthcare Manager/h3_Coming Soon'), 10)
}

