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

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

WebUI.click(findTestObject('Internal_Compose mail/Page_Healthcare Manager/span_InternalImail_icon icon-share Int_1'))

WebUI.click(findTestObject('Internal_Compose mail/Page_Healthcare Manager/span_Compose New Message'))

WebUI.setText(findTestObject('Internal_Compose mail/Page_Healthcare Manager/input'), 'archana')

WebUI.click(findTestObject('Internal_Compose mail/Page_Healthcare Manager/Page_Healthcare Manager/div_archana mohini'))

WebUI.setText(findTestObject('Internal_Compose mail/Page_Healthcare Manager/input_CC_subject'), 'Demo set')

WebUI.setText(findTestObject('Internal_Compose mail/Page_Healthcare Manager/textarea_CC_mail'), '91\taddons.manager\tDEBUG\tCalling shutdown blocker for GMPProvider')

WebUI.delay(2)

WebUI.click(findTestObject('Internal_Compose mail/Page_Healthcare Manager/i_This field is required_icon icon-share-icon'))

