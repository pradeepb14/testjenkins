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

not_run: WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

not_run: WebUI.click(findTestObject('Internal_Compose mail/Page_Healthcare Manager/span_InternalImail_icon icon-share Int_1'))

WebUI.click(findTestObject('new_gropmsg/Page_Healthcare Manager/a_Group Messages'))

WebUI.click(findTestObject('new_gropmsg/Page_Healthcare Manager/span_Departments'))

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_Accommodation  Client Services'))

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_Casual Staff Services'))

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_People  Culture'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_Business Systems'))

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_Marketing'))

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_Finance'))

WebUI.verifyElementClickable(findTestObject('new_gropmsg/Page_Healthcare Manager/div_DepartmentsAccommodation  Client ServicesCasual Staff ServicesPeople  CultureBusiness SystemsMarketingFinanceMy TeamtestNo Message Select'))

