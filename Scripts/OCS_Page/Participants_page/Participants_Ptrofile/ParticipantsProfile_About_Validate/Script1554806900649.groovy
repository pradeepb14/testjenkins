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

WebUI.callTestCase(findTestCase('SetUpp/SetUp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_Page_OB/Page_Healthcare Manager/input_Login here_username'), 'archana321')

WebUI.setText(findTestObject('Login_Page_OB/Page_Healthcare Manager/input_Login here_password'), 'Archana321@')

WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/button_Submit'))

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Participants'))

WebUI.verifyElementPresent(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/h1_Participants'), 10)

not_run: WebUI.verifyElementPresent(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/canvas_New Participant Graph_chartjs-render-monitor'), 
    10)

WebUI.click(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/span_Week'))

if (true) {
} else {
    WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/i_Female_icon icon-views'))
}

not_run: WebUI.sendKeys(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/input_Year_search'), 'archana archana')

not_run: WebUI.waitForElementClickable(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/span_Year_icon icon-search'), 
    10)

not_run: WebUI.click(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/small_Include Inactive'))

WebUI.doubleClick(findTestObject('Participants_Profile/Page_Healthcare Manager/i_Female_icon icon-views - Copy'))

not_run: WebUI.verifyElementVisible(findTestObject('Participants_Profile/Page_Healthcare Manager/portal access'))

WebUI.getText(findTestObject('Participants_Profile/Page_Healthcare Manager/profile name'))

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Contact History'))

WebUI.verifyElementText(findTestObject('Participants_Profile/Page_Healthcare Manager/Contact History Log'), 'Contact History Log:')

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Contact History Log_icon cross'))

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/a_Update About archana'))

WebUI.setText(findTestObject('Participants_Profile/Page_Healthcare Manager/lastname'), 'Archana')

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/button_Update'))

not_run: WebUI.verifyElementVisible(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Participant update successfully'))

