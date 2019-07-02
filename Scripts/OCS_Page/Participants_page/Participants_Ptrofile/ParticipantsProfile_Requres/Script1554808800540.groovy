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

not_run: WebUI.callTestCase(findTestCase('OCS_Page/Login_Page/LoginPage_Positive_validate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Participants'))

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/i_Female_icon icon-views - Copy'))

WebUI.click(findTestObject('profile_about_requre/Page_Healthcare Manager/a_Requires'))

not_run: WebUI.click(findTestObject('profile_about_requre/Page_Healthcare Manager/a_Update Btn Requirements'))

not_run: WebUI.click(findTestObject('profile_about_requre/Page_Healthcare Manager/button_Update requirement'))

