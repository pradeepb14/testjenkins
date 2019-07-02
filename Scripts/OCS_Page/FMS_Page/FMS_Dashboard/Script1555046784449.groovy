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

WebUI.verifyElementVisible(findTestObject('FMS_DashBoard/Page_Healthcare Manager/h1_Feedback_title'))

WebUI.sendKeys(findTestObject('FMS_DashBoard/Page_Healthcare Manager/input_Initiate FMS Case_srch_box'), 'archana')

WebUI.click(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Ongoing'))

WebUI.verifyElementClickable(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Completed'))

WebUI.click(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Cases'))

WebUI.click(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Incidents'))

if (true) {
    WebUI.sendKeys(findTestObject('profile_FMS/Page_Healthcare Manager/input_Please Enter Your Credentials_pin'), '123456')

    WebUI.submit(findTestObject('profile_FMS/Page_Healthcare Manager/input_Please Enter Your Credentials_pin'))
} else {
}

