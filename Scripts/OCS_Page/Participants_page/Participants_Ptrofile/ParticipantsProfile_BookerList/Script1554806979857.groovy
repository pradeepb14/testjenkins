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

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Participants'))

WebUI.verifyElementPresent(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/h1_Participants'), 10)

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/i_Female_icon icon-views - Copy'))

not_run: WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/bookerlist/Page_Healthcare Manager/a_ Bookers List'))

not_run: WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/bookerlist/Page_Healthcare Manager/i_booker_update_button'))

not_run: WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/bookerlist/Page_Healthcare Manager/span_drpdwnSelect-arrow'))

not_run: WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/bookerlist/Page_Healthcare Manager/div_Mother'))

not_run: WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/bookerlist/Page_Healthcare Manager/button_Submit'))

