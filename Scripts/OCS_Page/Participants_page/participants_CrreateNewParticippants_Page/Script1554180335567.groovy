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

WebUI.click(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/span_Create New Participant'))

String Un = 'TestDeozxdfvgdddd'

Object it = new Object()

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_User Name_username'), 
    variable)

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_First Name_firstname'), 
    'Testarch')

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Middle  Name_middlename'), 
    'archa')

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Last Name_lastname'), 
    'archa')

WebUI.click(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_No Preference'))

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/div_Female'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/input_DOB_Dob'))

WebUI.setText(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/input_DOB_Dob'), 
    '13/01/2004')

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/span_No'))

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Yes'))

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Relation'))

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Guardian'))

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Referrer First Name_Referrer_first_name'), 
    'archana')

WebUI.click(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_Last Name'))

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Last Name_Referrer_last_name'), 
    'archana')

WebUI.setText(findTestObject('participant_extra/Page_Healthcare Manager/input_Email_Referrer_email'), 'test1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Phone_Referrer_phone'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Phone (Primary)_phone_primary0'), 
    '1234567890')

WebUI.setText(findTestObject('participant_extra/Page_Healthcare Manager/input_Email_email_0'), 'testttttttttttttttttttttttttttt@gmail.com')

WebUI.setText(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/input_Address (Primary)_input_address_primary0'), 
    'test test')

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Please Select'))

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/span_NSW'))

WebUI.click(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_Suburb_Select-value'))

WebUI.setText(findTestObject('Object Repository/Participants_Page_OR/Create Participants/Page_Healthcare Manager/input'), 
    'liv')

WebUI.click(findTestObject('Participants_Page_OR/dashBoard/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Liverpool'))

WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/a_Save and Continue'))
WebUI.delay(1);
//def Name_username = WebUI.getAlertText(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_This username already exist'), 
//'This username already exist')
if (WebUI.verifyElementVisible(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_This username already exist'))) {
  print "Username is exit";
} else {
    WebUI.setText(findTestObject('Page_Healthcare Manager/textarea_Formal Diagnosis (Primary)_formaldiagnosisprimary'), 
        'test ')

    WebUI.setText(findTestObject('Page_Healthcare Manager/textarea_Other Information About Participant Care_participantcareinfo'), 
        'sddsgkjhkljkj;; ')

    WebUI.click(findTestObject('Page_Healthcare Manager/div_Please Select'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Healthcare Manager/div_Good'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/div_Please Selectcommunication'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/div_Non-Verbal'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/div_Please Selectenglish'))

    WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_Yes but not preferred'))

    WebUI.click(findTestObject('participant_extra/Page_Healthcare Manager/Page_Healthcare Manager/div_Please SelectLangage'))

    WebUI.click(findTestObject('participant_extra/Page_Healthcare Manager/Page_Healthcare Manager/div_English'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/div_Please Selectgender'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Female'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/div_Please Selectethnicity'))

    WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_Asian'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/div_Please Selectreligion'))

    WebUI.click(findTestObject('Participants_Page_OR/Create Participants/Page_Healthcare Manager/div_Buddhist'))

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/span'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Healthcare Manager/span_in home'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Healthcare Manager/span_dementia'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Healthcare Manager/span_shower'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/button_Save New Participant'))
}

