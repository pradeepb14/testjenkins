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

WebUI.callTestCase(findTestCase('OCS_Page/FMS_Page/Fms_password_Validate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/span_Initiate FMS Case_btn'))

WebUI.verifyElementPresent(findTestObject('FMS_Create_Case/Page_Healthcare Manager/h1_Creating Feedback Case_title'), 10)

WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/input_Event Date_event_date'), '12/04/2019')

WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/div_Case Category_drodwn'))

WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/span_Member of Public_drpdwn'))

if (true) {
    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/span_Member of Public'))

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/input_first_name'), 'Tom')

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/input_email'), 'test@gmail.com')

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/input_phone'), '1234567890')
} else if (false) {
    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/div_ONCALL Member_op2'))

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Search'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/input'), 
        'Rose')

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Rose Mary Test'))
} else if (false) {
    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/div_ONCALL Participant_op3'))

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Search'))

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/input'), 
        'archana')

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/div_dsfghg g Archana'))
} else if (false) {
    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/div_ONCALL (General)_op4'))

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/input_first_name'), 'Dummy')
} else {
    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/span_Member of Public'))

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/div_ONCALL UserAdmin_op5'))

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Search'))

    WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/input'), 
        'archana')

    WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_archana mohini'))
}

WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/span_Member of Public - Copy'))

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/Page_Healthcare Manager/div_ONCALL UserAdmin'))

WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Search'))

WebUI.click(findTestObject('FMS_Create_Case/Page_Healthcare Manager/div_Staff Performance_choose'))

WebUI.setText(findTestObject('FMS_Create_Case/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/input'), 
    'archana')

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/div_archana mohini'))

WebUI.setText(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/input_Event Location_event_location0'), 'dvsfhbfdjkbdjkgbkdfjzsbfbzsjgdfhgjkfk')

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/div_State'))

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/div_NSW'))

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/div_Suburb_Select-value'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/input_Surb'), 'liv')

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/div_Cullivel'))

WebUI.setText(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/input_Reason_title'), 'khnjksdbbbbbbbbbbbbbbbbbgadfhnkjhnkjererfhng')

WebUI.setText(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/textarea_Reason_description'), 'dfvbjh cjnvbjfbfjhbdfnvbhjfbaj jdnasbn djhdhfgvrdjb fvhng')

WebUI.setText(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/input_Notes_notes_title'), 'dfgdfggf')

WebUI.setText(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/textarea_Notes_notes'), 'dfgdasasdfgfgggghadfsda')

WebUI.click(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/button_Save Case'))

